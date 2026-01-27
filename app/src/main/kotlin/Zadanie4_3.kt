package org.example.app

const val SUNNY_WEATHER = true
const val OPEN_TENT = true
const val AIR_HUMIDITY_IN_PERCENT = 20
const val CURRENT_TIME_OF_YEAR = "Winter"

fun main() {

    val sunnyWeatherToday = true
    val tentOpen = true
    val airHumidityInPercent = 20
    val currentTimeOfYear = "winter"

    println(
        "Are conditions favorable for growing legumes now? - " + (sunnyWeatherToday == SUNNY_WEATHER && tentOpen == OPEN_TENT
                && airHumidityInPercent == AIR_HUMIDITY_IN_PERCENT && currentTimeOfYear.lowercase() != CURRENT_TIME_OF_YEAR.lowercase())
    )

}