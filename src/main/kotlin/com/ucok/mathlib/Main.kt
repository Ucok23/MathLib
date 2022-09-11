package com.ucok.mathlib

import com.ucok.mathlib.geometric.Line
import com.ucok.mathlib.geometric.Point
import com.ucok.mathlib.geometric.solid.Cube
import com.ucok.mathlib.geometric.solid.RectPrism

fun main() {
    val point = Point(x = null, y = null)
    val line = Line(point, point)
    println(line)

    val cube = Cube(12.0)
    cube.length = 1.0
    println(cube.area)

    val rectPrism = RectPrism(2.0, 2.0, 1.0)
    println(rectPrism.area)
    println(rectPrism.volume)
    println(rectPrism.spaceDiagonal)
}