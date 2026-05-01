package com.alagarce.springicons

import com.alagarce.springicons.data.icons.objects.FileIcons
import com.alagarce.springicons.data.icons.objects.InterfaceIcons
import com.alagarce.springicons.data.icons.objects.MockIcons
import com.alagarce.springicons.rules.objects.FileRules
import com.alagarce.springicons.rules.objects.InterfaceRules
import com.alagarce.springicons.rules.objects.MockRules
import com.alagarce.springicons.utils.RegexConst
import com.intellij.ide.IconProvider
import com.intellij.psi.PsiClass
import com.intellij.psi.PsiElement
import javax.swing.Icon

class SpringBootIconProvider : IconProvider() {

    override fun getIcon(element: PsiElement, flags: Int): Icon? {
        val file = element.containingFile?.virtualFile ?: return null
        val name = file.name
        val path = file.parent?.path ?: return null

        val MOCK_REGEX = Regex(RegexConst.MOCK_REGEX)

        val (iconSet, rules) = when {
            MOCK_REGEX.matches(name) ->
                MockIcons to MockRules.rules

            element is PsiClass && element.isInterface ->
                InterfaceIcons to InterfaceRules.rules

            else ->
                FileIcons to FileRules.rules
        }

        val applyingRule = rules.firstOrNull { it.matches(name) }

        val isAbstract = element is PsiClass &&
                (element.modifierList?.text?.contains("abstract") == true)

        if (applyingRule?.icon == iconSet["default"] && element is PsiClass) {
            if (Regex(".*/(model|entity|domain).*").containsMatchIn(path)) {

                val baseIcon = iconSet["model"]

                return if (isAbstract)
                    AlphaIcon(baseIcon, 0.6f)
                else
                    baseIcon
            }
        }

        if (isAbstract && applyingRule?.icon != null) {
            return AlphaIcon(applyingRule.icon, 0.6f)
        }

        return applyingRule?.icon
    }


}