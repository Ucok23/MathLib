package com.ucok.mathlib.geometric.solid

import org.junit.jupiter.api.Test

internal class CubeTest {

    private val testCube = Cube(2.0)

    @Test
    fun testArea() = assert(testCube.area == 12.0)

    @Test
    fun testCalcArea() = assert(Cube.calcArea(2.0) == 12.0)

    @Test
    fun testVolume() = assert(testCube.volume == 8.0)

    @Test
    fun testCalcVolume() = assert(Cube.calcVolume(2.0) == 8.0)

    @Test
    fun testFaceDiagonal() = assert(testCube.faceDiagonal == 2.0)

    @Test
    fun testCalcFaceDiagonal() = assert(Cube.calcFaceDiagonal(2.0) == 2.0)

    @Test
    fun testSpaceDiagonal() =
        assert(String.format("%.2f", testCube.spaceDiagonal).toDouble() == 2.45)

    @Test
    fun testCalcSpaceDiagonal() =
        assert(String.format("%.2f",
            Cube.calcSpaceDiagonal(2.0)).toDouble() == 2.45)
}