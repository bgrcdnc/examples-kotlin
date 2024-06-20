package org.example

fun main() {
    val name: String = "Buğra" //explicitly given type due to practice - ignore warning
    val age = 27

    print("What is your surname, $name? : ")
    val surname: String = readln()

    print("Hello, $name $surname; aged $age")
}