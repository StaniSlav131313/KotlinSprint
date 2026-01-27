package org.example.app

fun main() {

    val dayCurrent = 5
    val dayTrainingHandsAndAbs = dayCurrent % 2 == 1 && dayCurrent != 0
    val dayTrainingLegsAndBack = dayCurrent % 2 == 0 && dayCurrent != 0

    println(
        "Arm exercises: $dayTrainingHandsAndAbs \nLeg exercises: $dayTrainingLegsAndBack " +
                "\nBack exercises: $dayTrainingLegsAndBack \nAbs exercises: $dayTrainingHandsAndAbs"
    )
}