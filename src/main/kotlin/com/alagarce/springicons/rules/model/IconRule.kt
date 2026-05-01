package com.alagarce.springicons.data.mapping

import java.util.regex.Pattern
import javax.swing.Icon

@JvmRecord
data class IconRule(val pattern: Pattern, val  icon: Icon){
    fun matches(fileName: String): Boolean =
        pattern.matcher(fileName).matches()}