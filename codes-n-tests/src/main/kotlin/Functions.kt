package org.example

fun addInts(int1: Int, int2: Int): Int {
    return int1 + int2
}

fun main() {
    println(" ---- Functions ----")
    printVariable("addInts(2,3)", addInts(2,3))
}