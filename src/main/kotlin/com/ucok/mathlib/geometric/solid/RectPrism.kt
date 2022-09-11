package com.ucok.mathlib.geometric.solid

import kotlin.math.pow
import kotlin.math.sqrt

class RectPrism(var p: Double, var l: Double, var t:Double): Shape {
    override val area: Double
        get() = 2 * (p * l + p * t + l * t)

    override val volume: Double
        get() = p * l * t

    val spaceDiagonal: Double
        get() = sqrt(p.pow(2) + l.pow(2) + t.pow(2))
}