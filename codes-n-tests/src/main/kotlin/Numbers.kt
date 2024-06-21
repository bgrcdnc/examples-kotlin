package org.example

fun main() {
    println(" ---- Boxed && Unboxed ---- ")
    val number: Int = 127 // int
    val boxedNumber: Int? = number
    val anotherBoxedNumber: Int? = number
    println(
        "$number -> boxedNumber === anotherBoxedNumber : " + (boxedNumber === anotherBoxedNumber)
    ) // true

    val number2: Int = 128
    val boxedNumber2: Int? = number2
    val anotherBoxedNumber2: Int? = number2
    println(
        "$number2 -> boxedNumber2 === anotherBoxedNumber2 : " + (boxedNumber2 === anotherBoxedNumber2)
    ) // false

    /** Type conversion **/
//    implicit type conversion yok -> var number: Int = (Int) 13L
    println("\n ---- Type Conversion ---- ")

//    Type conversion yapmak için açık bir şekilde dönüştürmek lazım
    val intValue: Int = (13L).toInt()
    println("(${intValue::class.qualifiedName} - ${intValue::class.simpleName}) - intValue: $intValue (from 13L with toInt())")

//    Number Auto-cast
    println("\n ---- Number Type Cast ---- ")
    val val1 = arrayListOf(34, 34L, 34.0, 34.0F, "3401283091829827394827", (34).toShort(), (34).toByte())
    for (num in val1) println("value '$num' is '${num::class.simpleName}'")

}