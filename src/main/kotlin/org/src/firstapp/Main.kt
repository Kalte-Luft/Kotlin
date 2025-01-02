package org.src.firstapp

fun main() {
    welcome()
    userInfo()
    val chosenDepartment = displayDepartment()
    println("You chose: $chosenDepartment")
}

fun welcome() {
    println("Welcome to VKU University!")
}

fun userInfo() {
    print("Enter Name: ")
    val name = readLine() ?: "Unknown"

    print("Enter Age: ")
    val age = readLine()?.toIntOrNull() ?: 0

    print("Enter GPA: ")
    val gpa = readLine()?.toDoubleOrNull() ?: 0.0

    println("==== User Info ====")
    println("Name: $name")
    println("Age: $age")
    println("GPA: $gpa")
}

fun displayDepartment(): String {
    val departments = listOf("Software Engineering", "Data Science", "Cybersecurity")
    println("==== Departments ====")
    for ((index, department) in departments.withIndex()) {
        println("${index + 1}. $department")
    }

    print("Choose a department (1-${departments.size}): ")
    val choice = readLine()?.toIntOrNull() ?: 1
    return if (choice in 1..departments.size) departments[choice - 1] else departments[0]
}
