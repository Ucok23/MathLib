package com.ucok.mathlib.geometric.solid

import kotlin.math.pow
import kotlin.math.sqrt

class Cube(private val length: Double): Shape {
    override fun getArea(): Double = 6 * length

    override fun getVolume(): Double = length.pow(3)

    fun getFaceDiagonal(): Double = sqrt(2 * length)

    fun getSpaceDiagonal(): Double = sqrt(3 * length)
}