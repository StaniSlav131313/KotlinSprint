package org.example.app

fun main() {

    var start = "E2"
    var end = "E4"
    var moveNumber = 1

    val blackFigure = "$start - $end;  Move number: $moveNumber"

    println("Black to move: $blackFigure")

    start = "D2"
    end = "D3"
    moveNumber = 2

    val whiteFigure = "$start - $end;  Move number: $moveNumber"

    println("White to move: $whiteFigure")

}