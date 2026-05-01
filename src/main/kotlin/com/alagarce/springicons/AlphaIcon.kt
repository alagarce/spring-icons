package com.alagarce.springicons

import java.awt.AlphaComposite
import java.awt.Component
import java.awt.Graphics
import java.awt.Graphics2D
import javax.swing.Icon

class AlphaIcon(
    private val base: Icon,
    private val alpha: Float // entre 0f et 1f
) : Icon {

    override fun paintIcon(
        c: Component?,
        g: Graphics?,
        x: Int,
        y: Int
    ) {
        val g2 = g as? Graphics2D ?: return

        val oldComposite = g2.composite
        g2.composite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha)

        base.paintIcon(c, g2, x, y)

        g2.composite = oldComposite
    }

    override fun getIconWidth(): Int = base.iconWidth
    override fun getIconHeight(): Int = base.iconHeight
}