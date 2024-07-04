package org.example

fun main() {
    val byteArray = byteArrayOf(1, 2, 3, 4, 5)
    val charArray = charArrayOf('a', 'b', 'c', 'd', 'e')
    val intArray = intArrayOf(250, 500, 750, 1000, 1250)
    val regularArray = arrayOf("Ahmet", "Mehmet", "Ayse", "Fatma", "Hayriye")
    val constArray = Array<Int>(5) {
        it * it
    }
    printVariable(name = "byteArray", byteArray.joinToString())
    printVariable(name = "charArray", charArray.joinToString())
    printVariable(name = "intArray", intArray.joinToString())
    printVariable(name = "regularArray", regularArray.joinToString())
    printVariable(name = "constArray", constArray.joinToString())
}