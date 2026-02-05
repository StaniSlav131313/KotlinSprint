package org.example.app.Lession_2

fun main() {

    val hourStart = 9
    val minuteStart = 39
    val departureTime = String.format("%02d:%02d", hourStart, minuteStart)

    val flightTime = 457

    val hourEnd = flightTime / 60
    val minuteEnd = (flightTime % 60)

    val hourSum = hourStart + hourEnd
    val minuteSum = minuteStart + minuteEnd

    val arrivalTime = String.format("%02d:%02d", hourSum, minuteSum)

    println("Departure time: $departureTime ")
    println("Arrival time: $arrivalTime")

}