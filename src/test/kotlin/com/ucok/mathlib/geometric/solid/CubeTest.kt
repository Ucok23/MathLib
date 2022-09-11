package com.ucok.mathlib.geometric.solid

import org.junit.jupiter.api.Test

internal class CubeTest {

    private val testCube = Cube(2.0)

    @Test
    fun getArea() = assert(testCube.getArea() == 12.0)

    @Test
    fun getVolume() = assert(testCube.getVolume() == 8.0)

    @Test
    fun getFaceDiagonal() = assert(testCube.getFaceDiagonal() == 2.0)

    @Test
    fun spaceDiagonal() = assert(String.format("%.2f", testCube.getSpaceDiagonal()).toDouble() == 2.45)
}