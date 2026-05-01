package com.alagarce.springicons

import com.alagarce.springicons.data.icons.objects.FolderIcons
import com.alagarce.springicons.rules.model.IconRule
import com.alagarce.springicons.rules.mapping.MappingRules
import com.intellij.ide.projectView.PresentationData
import com.intellij.ide.projectView.ProjectViewNode
import com.intellij.ide.projectView.ProjectViewNodeDecorator
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager

class SpringBootNodeDecorator: ProjectViewNodeDecorator {


    fun extractPsi(value: Any, project: Project): PsiElement? {
        return when (value) {
            is PsiElement -> value
            is com.intellij.openapi.vfs.VirtualFile ->
                PsiManager.getInstance(project).findDirectory(value)

            else -> null
        }
    }


    override fun decorate(
        node: ProjectViewNode<*>,
        data: PresentationData
    ) {
        val value = node.value ?: return

        val psi = extractPsi(value, node.project) ?: return

        if (psi is PsiDirectory) {
            val path = psi.virtualFile.path.lowercase()

            val applyingRule =  MappingRules.FOLDER_RULES.stream()
                .filter { rule: IconRule? -> rule!!.pattern.matcher(path).matches() }
                .findFirst().orElse(null);

            data.setIcon(applyingRule?.icon ?: FolderIcons.default);
            if(data.getIcon(open = false) == FolderIcons.hidden){
                val base = data.forcedTextForeground ?: com.intellij.ui.JBColor.foreground()

                val faded = java.awt.Color(
                    base.red,
                    base.green,
                    base.blue,
                    120 // alpha entre 0 et 255
                )

                data.forcedTextForeground = faded
            }

            return;
        }
    }
}