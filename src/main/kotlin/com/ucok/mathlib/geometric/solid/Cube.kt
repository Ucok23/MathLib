package com.ucok.mathlib.geometric.solid

import kotlin.math.pow
import kotlin.math.sqrt

class Cube(var length: Double): Shape {

    init {
        when {
            length < 1 -> throw IllegalArgumentException("length must be positive")
        }
    }

    override val area: Double
        get() = 6 * length

    override val volume: Double
        get() = length.pow(3)

    val faceDiagonal: Double
        get() = sqrt(2 * length)

    val spaceDiagonal: Double
        get() = sqrt(3 * length)
}