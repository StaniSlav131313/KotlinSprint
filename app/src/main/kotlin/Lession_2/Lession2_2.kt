package org.example.app.Lession_2

fun main() {

    val employees = 50
    val interns = 30
    val employeesSalary = 30000
    val internsSalary = 20000

    val expensesForPermanentEmployees = employees * employeesSalary

    println(expensesForPermanentEmployees)

    val expensesForPermanentEmployeesAndInterns = expensesForPermanentEmployees + (interns * internsSalary)

    println(expensesForPermanentEmployeesAndInterns)

    val averageSalaryPerEmployee = expensesForPermanentEmployeesAndInterns / (employees + interns)

    println(averageSalaryPerEmployee)

}