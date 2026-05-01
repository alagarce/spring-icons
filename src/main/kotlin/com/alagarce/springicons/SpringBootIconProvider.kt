package com.alagarce.springicons

import com.alagarce.springicons.data.icons.FileIcons
import com.alagarce.springicons.data.mapping.IconRule
import com.intellij.ide.IconProvider
import com.intellij.psi.PsiElement
import java.util.regex.Pattern
import javax.swing.Icon

class MyIconProvider : IconProvider() {


    val RULES = listOf<IconRule?>(
        IconRule(Pattern.compile(".*Controller\\.java$"), FileIcons.controller),
        IconRule(Pattern.compile(".*Service\\.java$"), FileIcons.service),
        IconRule(Pattern.compile(".*Repository\\.java$"), FileIcons.repository),
    )

    override fun getIcon(element: PsiElement, flags: Int): Icon? {
        val file = element.containingFile?.virtualFile ?: return null
        val name = file.name


        val rule =  RULES.stream()
            .filter { rule: IconRule? -> rule!!.pattern.matcher(name).matches() }
            .findFirst().orElse(null);


        return rule?.icon;
    }
}