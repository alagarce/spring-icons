package com.alagarce.springicons.rules.mapping

import com.alagarce.springicons.data.icons.objects.FolderIcons
import com.alagarce.springicons.rules.model.IconRule
import com.alagarce.springicons.rules.model.RuleDef
import com.alagarce.springicons.utils.RegexConst
import java.util.regex.Pattern

object MappingRules {

    @JvmStatic
    val FILE_RULES = listOf<RuleDef>(
        RuleDef(RegexConst.FILE_CONTROLLER, "controller"),
        RuleDef(RegexConst.FILE_SERVICE, "service"),
        RuleDef(RegexConst.FILE_REPOSITORY, "repository"),
        RuleDef(RegexConst.FILE_MAPPER, "mapper"),
        RuleDef(RegexConst.FILE_ERROR, "error"),
        RuleDef(RegexConst.FILE_MODEL, "model"),
        RuleDef(RegexConst.FILE_CONFIG, "config"),
        RuleDef(RegexConst.FILE_ENUM, "enum"),
        RuleDef(RegexConst.FILE_EVENT, "event"),
        RuleDef(RegexConst.FILE_INPUT, "input"),
        RuleDef(RegexConst.FILE_OUTPUT, "output"),
        RuleDef(RegexConst.FILE_DTO, "dto"),
        RuleDef(RegexConst.FILE_SCHEDULE, "schedule"),
        RuleDef(RegexConst.FILE_SECURITY, "security"),
        RuleDef(RegexConst.FILE_VALIDATOR, "validator"),
        RuleDef(RegexConst.FILE_FILTER, "filter"),
        RuleDef(RegexConst.FILE_TEST, "test"),
        RuleDef(RegexConst.FILE_APP, "app"),
        RuleDef(RegexConst.FILE_CLIENT, "client"),
        RuleDef(RegexConst.FILE_GIT, "git"),
        RuleDef(RegexConst.FILE_GRADLE, "gradle"),
        RuleDef(RegexConst.FILE_TERMINAL, "terminal"),
        RuleDef(RegexConst.FILE_SHELL, "terminal"),
        RuleDef(RegexConst.FILE_PROPERTIES, "properties"),
        RuleDef(RegexConst.FILE_DEFAULT, "default"),

        )

    @JvmStatic
    val FOLDER_RULES = listOf<IconRule?>(
        IconRule(Pattern.compile(RegexConst.FOLDER_CONTROLLER), FolderIcons.controller),
        IconRule(Pattern.compile(RegexConst.FOLDER_SERVICE), FolderIcons.service),
        IconRule(Pattern.compile(RegexConst.FOLDER_FILTER), FolderIcons.filter),
        IconRule(Pattern.compile(RegexConst.FOLDER_REPOSITORY), FolderIcons.repository),
        IconRule(Pattern.compile(RegexConst.FOLDER_DTO), FolderIcons.dto),
        IconRule(Pattern.compile(RegexConst.FOLDER_MAPPER), FolderIcons.mapper),
        IconRule(Pattern.compile(RegexConst.FOLDER_MODEL), FolderIcons.model),
        IconRule(Pattern.compile(RegexConst.FOLDER_CONFIG), FolderIcons.config),
        IconRule(Pattern.compile(RegexConst.FOLDER_ERROR), FolderIcons.error),
        IconRule(Pattern.compile(RegexConst.FOLDER_CLIENT), FolderIcons.client),
        IconRule(Pattern.compile(RegexConst.FOLDER_SECURITY), FolderIcons.security),
        IconRule(Pattern.compile(RegexConst.FOLDER_VALIDATOR), FolderIcons.validator),
        IconRule(Pattern.compile(RegexConst.FOLDER_ENUM), FolderIcons.enum),
        IconRule(Pattern.compile(RegexConst.FOLDER_EVENT), FolderIcons.event),
        IconRule(Pattern.compile(RegexConst.FOLDER_SCHEDULE), FolderIcons.schedule),
        IconRule(Pattern.compile(RegexConst.FOLDER_SPECS), FolderIcons.specs),
        IconRule(Pattern.compile(RegexConst.FOLDER_SHARED), FolderIcons.shared),
        IconRule(Pattern.compile(RegexConst.FOLDER_TEST), FolderIcons.tests),
        IconRule(Pattern.compile(RegexConst.FOLDER_RESOURCES), FolderIcons.resources),
        IconRule(Pattern.compile(RegexConst.FOLDER_MAIN), FolderIcons.app),
        IconRule(Pattern.compile(RegexConst.FOLDER_TESTS), FolderIcons.tests),
        IconRule(Pattern.compile(RegexConst.FOLDER_APP), FolderIcons.app),
        IconRule(Pattern.compile(RegexConst.FOLDER_SRC), FolderIcons.src),
        IconRule(Pattern.compile(RegexConst.FOLDER_HIDDEN), FolderIcons.hidden),
        IconRule(Pattern.compile(RegexConst.FOLDER_BUILD), FolderIcons.hidden),

        )
}