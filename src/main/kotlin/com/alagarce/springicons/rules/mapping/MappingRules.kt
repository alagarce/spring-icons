package com.alagarce.springicons.data.mapping

import com.alagarce.springicons.data.icons.FileIcons
import com.alagarce.springicons.data.icons.FolderIcons
import java.util.regex.Pattern

object MappingRules {

    @JvmStatic val FILE_RULES = listOf<RuleDef>(
        RuleDef(".*Controller.*\\.java$", "controller"),
        RuleDef(".*Service.*\\.java$", "service"),
        RuleDef(".*Repository.*\\.java$", "repository"),
        RuleDef(".*(Mapper|Utils|Util).*\\.java$", "mapper"),
        RuleDef(".*(Error|Exception).*\\.java$", "error"),
        RuleDef(".*(Entity|Model).*\\.java$", "model"),
        RuleDef(".*Config.*\\.java$", "config"),
        RuleDef(".*Enum.*\\.java$", "enum"),
        RuleDef(".*(Event|Listener).*\\.java$", "event"),
        RuleDef(".*(Input|Request).*\\.java$", "input"),
        RuleDef(".*Output.*\\.java$", "output"),
        RuleDef(".*(Dto|DTO|Record).*\\.java$", "dto"),
        RuleDef(".*(Scheduler|Job|TaskCron|Cronjob).*\\.java$", "schedule"),
        RuleDef(".*(Security|Auth).*\\.java$", "security"),
        RuleDef(".*(Validator|Guard).*\\.java$", "validator"),
        RuleDef(".*(Filter|Criteria|Specification).*\\.java$", "filter"),
        RuleDef(".*(Test|Tests)\\.java$", "test"),
        RuleDef("(^|.*)(App|Application|Main)\\.java$", "app"),
        RuleDef(".*Client.*\\.java$", "client"),
        RuleDef("\\.git.*", "git"),
        RuleDef(".*\\.gradle.*", "gradle"),
        RuleDef("(gradlew|mvnw)", "terminal"),
        RuleDef(".*\\.(sh|bat|cmd|ps1)$", "terminal"),
        RuleDef(".*\\.properties$", "properties"),
        RuleDef(".*\\.java$", "default"),

        )

    @JvmStatic val FOLDER_RULES = listOf<IconRule?>(
        IconRule(Pattern.compile(".*\\/controller.*"), FolderIcons.controller),
        IconRule(Pattern.compile(".*\\/service.*"), FolderIcons.service),
        IconRule(Pattern.compile(".*\\/(criteria|filter|specification).*"), FolderIcons.filter),
        IconRule(Pattern.compile(".*\\/repository.*"), FolderIcons.repository),
        IconRule(Pattern.compile(".*\\/dto.*"), FolderIcons.dto),
        IconRule(Pattern.compile(".*\\/(mapper|utils).*"), FolderIcons.mapper),
        IconRule(Pattern.compile(".*\\/(model|entity|domain).*"), FolderIcons.model),
        IconRule(Pattern.compile(".*\\/config.*"), FolderIcons.config),
        IconRule(Pattern.compile(".*\\/(error|exception).*"), FolderIcons.error),
        IconRule(Pattern.compile(".*\\/client.*"), FolderIcons.client),
        IconRule(Pattern.compile(".*\\/(security|auth).*"), FolderIcons.security),
        IconRule(Pattern.compile(".*\\/(validator|guard).*"), FolderIcons.validator),
        IconRule(Pattern.compile(".*\\/.*enum.*"), FolderIcons.enum),
        IconRule(Pattern.compile(".*\\/(event|listener).*"), FolderIcons.event),
        IconRule(Pattern.compile(".*\\/(scheduler|job|cronjob).*"), FolderIcons.schedule),
        IconRule(Pattern.compile(".*\\/(specs|doc).*"), FolderIcons.specs),
        IconRule(Pattern.compile(".*\\/(shared|common).*"), FolderIcons.shared),
        IconRule(Pattern.compile(".*\\/test.*"), FolderIcons.tests),
        IconRule(Pattern.compile(".*\\/resources.*"), FolderIcons.resources),
        IconRule(Pattern.compile(".*\\/main.*"), FolderIcons.app),
        IconRule(Pattern.compile(".*\\/tests.*"), FolderIcons.tests),
        IconRule(Pattern.compile(".*\\/app"), FolderIcons.app),
        IconRule(Pattern.compile(".*\\/src$"), FolderIcons.src),
        IconRule(Pattern.compile(".*/\\.[^/]+$"), FolderIcons.hidden),
        IconRule(Pattern.compile(".*\\/(build|target|gradle)$"), FolderIcons.hidden),

        )
}