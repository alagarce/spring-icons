package com.alagarce.springicons.data.mapping

import com.alagarce.springicons.data.icons.IconSetFactory
import java.util.regex.Pattern

open class MappingRulesFactory(private val icons: IconSetFactory) {
    val rules: List<IconRule> = MappingRules.FILE_RULES.map { rule ->
        IconRule(
            Pattern.compile(rule.regex),
            icons[rule.iconName]
        )
    }
}