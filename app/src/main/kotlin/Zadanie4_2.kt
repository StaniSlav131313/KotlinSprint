package org.example.app

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_CAPACITY = 100

fun main() {

    var weight = 20
    var capacity = 80

    println(
        "A load weighing $weight kg and having a volume of $capacity l corresponds to the 'Average' category: "
                + ((weight > AVERAGE_MIN_WEIGHT && weight <= AVERAGE_MAX_WEIGHT) && capacity < AVERAGE_CAPACITY)
    )

    weight = 50
    capacity = 100

    println(
        "A load weighing $weight kg and having a volume of $capacity l corresponds to the 'Average' category: "
                + ((weight > AVERAGE_MIN_WEIGHT && weight <= AVERAGE_MAX_WEIGHT) && capacity < AVERAGE_CAPACITY)
    )

}