package com.ucok.mathlib.geometric

data class Point(
    val x: Number?,
    val y: Number?
)

data class Line(
    val a: Point,
    val b: Point
)