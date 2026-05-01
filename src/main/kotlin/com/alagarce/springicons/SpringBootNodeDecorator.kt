package com.alagarce.springicons

import com.alagarce.springicons.data.icons.FolderIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.ide.projectView.ProjectViewNode
import com.intellij.ide.projectView.ProjectViewNodeDecorator
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager

class MyNodeDecorator: ProjectViewNodeDecorator {


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

        // On récupère le PSI associé au nœud
        val psi = extractPsi(value, node.project) ?: return

        // On ne traite que les dossiers (packages Java inclus)
        if (psi is PsiDirectory) {
            val path = psi.virtualFile.path.lowercase()

            // DEBUG
            println("DECORATOR: $path")

            // Exemple : controller
            if (path.contains("/controller")) {
                data.setIcon(FolderIcons.controller)
                return
            }

            // Exemple : service
            if (path.contains("/service")) {
                data.setIcon(FolderIcons.service)
                return
            }

            // Exemple : repository
            if (path.contains("/repository")) {
                data.setIcon(FolderIcons.repository)
                return
            }

            // Exemple : dto
            if (path.contains("/dto")) {
                data.setIcon(FolderIcons.dto)
                return
            }

            // Exemple : model
            if (path.contains("/model")) {
                data.setIcon(FolderIcons.model)
                return
            }
            return;
        }
    }
}