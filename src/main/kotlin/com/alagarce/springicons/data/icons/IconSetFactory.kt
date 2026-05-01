package com.alagarce.springicons.data.icons

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

open class IconSetFactory(private val basePath: String) {
    private val ICON_NAMES = listOf(
        "controller",
        "service",
        "mapper",
        "config",
        "dto",
        "error",
        "model",
        "repository",
        "test",
        "app",
        "default",
        "enum",
        "event",
        "git",
        "gradle",
        "terminal",
        "properties",
        "schedule",
        "security",
        "validator",
        "filter",
        "client",
        "input",
        "output"
    )

    private fun load(name: String): Icon =
        IconLoader.getIcon("$basePath/$name.svg", IconSetFactory::class.java)

    val icons: Map<String, Icon> = ICON_NAMES.associateWith { load(it) }

    operator fun get(name: String): Icon = icons[name]!!
}