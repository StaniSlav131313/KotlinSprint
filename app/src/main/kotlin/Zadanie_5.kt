package org.example.app

fun main() {

    val seconds = 6480
    val hour = seconds / 3600
    val minute = seconds % 3600 / 60

    println("0$hour:$minute:00")

}