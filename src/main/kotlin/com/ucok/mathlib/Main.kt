package com.ucok.mathlib

import com.ucok.mathlib.geometric.Line
import com.ucok.mathlib.geometric.Point
import com.ucok.mathlib.geometric.solid.Cube

fun main() {
    val point = Point(x = null, y = null)
    val line = Line(point, point)
    println(line)

    val cube = Cube(12.0)
    cube.length = 1.0
    println(cube.area)
}