package org.example.app

fun main() {

    val positionFigureAndMoveNumber = "D2-D4;0"

    val parsData = positionFigureAndMoveNumber.split("-", ";")

    val startPosition = parsData[0]
    val endPosition = parsData[1]
    val move = parsData[2]

    println("Starting position: $startPosition")
    println("End position: $endPosition")
    println("Move number: $move")

}