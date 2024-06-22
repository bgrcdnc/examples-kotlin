package org.example

fun main() {
    val c: Char = 'c'
    val boxedC : Char? = c
    val boxedC2 : Char? = c
    println(c)
    println(boxedC === boxedC2)
}