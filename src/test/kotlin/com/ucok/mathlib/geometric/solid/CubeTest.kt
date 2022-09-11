package com.ucok.mathlib.geometric.solid

import org.junit.jupiter.api.Test

internal class CubeTest {

    private val testCube = Cube(2.0)

    @Test
    fun getArea() = assert(testCube.area == 12.0)

    @Test
    fun getVolume() = assert(testCube.volume == 8.0)

    @Test
    fun getFaceDiagonal() = assert(testCube.faceDiagonal == 2.0)

    @Test
    fun spaceDiagonal() = assert(String.format("%.2f", testCube.spaceDiagonal).toDouble() == 2.45)
}