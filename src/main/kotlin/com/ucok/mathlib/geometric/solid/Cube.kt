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
        get() = calcArea(length)

    override val volume: Double
        get() = calcVolume(length)

    val faceDiagonal: Double
        get() = calcFaceDiagonal(length)

    val spaceDiagonal: Double
        get() = calcSpaceDiagonal(length)

    companion object {

        fun calcArea(length: Double) = 6 * length

        fun calcVolume(length: Double) = length.pow(3)

        fun calcFaceDiagonal(length: Double) = sqrt(2 * length)

        fun calcSpaceDiagonal(length: Double) = sqrt(3 * length)
    }
}