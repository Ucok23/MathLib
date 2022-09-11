package com.ucok.mathlib.geometric.solid

import kotlin.math.pow

class Cube(private val length: Double): Shape {
    override fun getArea(): Double = 6 * length

    override fun getVolume(): Double = length.pow(3)

}