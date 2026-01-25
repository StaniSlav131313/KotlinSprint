package org.example.app

import kotlin.math.floor
import kotlin.math.pow

fun main() {

    val сontribution = 70000
    val interestRate = 16.7
    val year = 20

    val totalAmount = сontribution * ((1 + (interestRate / 100)).pow(year))
    val totalAmountAbbreviated = floor(totalAmount * 1000.0) / 1000.0

    println(totalAmountAbbreviated)

}
