package org.example.app

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val boost = 1.2

    val crystalBoost = (crystalOre * boost - crystalOre).toInt()
    println("$crystalOre crystal ore added to your inventory! (+$crystalBoost)")

    val ironBoost = (ironOre * boost - ironOre).toInt()
    println("$ironOre iron ore added to your inventory! (+$ironBoost)")

}