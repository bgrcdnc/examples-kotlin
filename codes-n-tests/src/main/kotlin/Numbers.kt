package org.example

fun main() {
    val number: Int = 100 // int
    val boxedNumber: Int? = number
    val anotherBoxedNumber: Int? = number
    println("boxedNumber === anotherBoxedNumber : " +
            (boxedNumber === anotherBoxedNumber)) // true

    val number2: Int = 10000
    val boxedNumber2 : Int? = number2
    val anotherBoxedNumber2 : Int? = number2
    println("boxedNumber2 === anotherBoxedNumber2 : " +
            (boxedNumber2 === anotherBoxedNumber2)) // false
}