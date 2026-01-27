package org.example.app

const val TABLES_IN_RESTAURANT = 13

fun main() {

    val todayTables = 13
    val tomorrowTables = 9

    println(
        "Table availability for today: ${todayTables < TABLES_IN_RESTAURANT} " +
                "\nTable availability for tomorrow: ${tomorrowTables < TABLES_IN_RESTAURANT}"
    )

}