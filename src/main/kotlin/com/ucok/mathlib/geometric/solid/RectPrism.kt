package com.ucok.mathlib.geometric.solid

import kotlin.math.pow
import kotlin.math.sqrt

class RectPrism(var p: Double, var l: Double, var t:Double): Shape {
    override val area: Double
        get() = calcArea(p, l, t)

    override val volume: Double
        get() = calcVolume(p, l, t)

    val spaceDiagonal: Double
        get() = calcSpaceDiagonal(p, l, t)

    companion object {
        fun calcArea(p: Double, l: Double, t: Double) = 2 * (p * l + p * t + l * t)

        fun calcVolume(p: Double, l: Double, t: Double) = p * l * t

        fun calcSpaceDiagonal(p: Double, l: Double, t: Double) =
            sqrt(p.pow(2) + l.pow(2) + t.pow(2))
    }
}