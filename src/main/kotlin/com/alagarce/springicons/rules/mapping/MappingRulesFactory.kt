package com.alagarce.springicons.rules.mapping

import com.alagarce.springicons.data.icons.IconSetFactory
import com.alagarce.springicons.rules.model.IconRule
import java.util.regex.Pattern

open class MappingRulesFactory(private val icons: IconSetFactory) {
    val rules: List<IconRule> = MappingRules.FILE_RULES.map { rule ->
        IconRule(
            Pattern.compile(rule.regex),
            icons[rule.iconName]
        )
    }
}