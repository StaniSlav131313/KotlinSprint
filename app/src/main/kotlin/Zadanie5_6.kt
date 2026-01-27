package org.example.app

fun main() {
    println("Enter your weight:")
    val weight = readln().toFloat()

    println("Enter your height:")
    val height = readln().toFloat()

    val bmi = (weight / ((height * height) / 100.0)) * 100.0
    val indexMass = "%.2f".format(bmi)
    when (bmi) {

        in 0.0..<18.5 -> println("Underweight")
        in 18.5..<25.0 -> println("Normal body weight")
        in 25.0..<30.0 -> println("Overweight")
        else -> println("Obesity")
    }

    println("Your body index mass: $indexMass")

}