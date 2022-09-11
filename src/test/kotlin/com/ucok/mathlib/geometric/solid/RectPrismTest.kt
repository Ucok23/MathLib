package com.ucok.mathlib.geometric.solid

import org.junit.jupiter.api.Test

internal class RectPrismTest {
    private val rectPrism = RectPrism(2.0, 2.0, 1.0)

    @Test
    fun testArea() = assert(rectPrism.area == 16.0)

    @Test
    fun testVolume() = assert(rectPrism.volume == 4.0)

    @Test
    fun testSpaceDiagonal() = assert(rectPrism.spaceDiagonal == 3.0)
}