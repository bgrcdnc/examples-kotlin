package org.example

class MyInt(pValue: Int) {
    var value = pValue
        private set

    infix fun add(pMyInt: MyInt) {
        this.value += pMyInt.value
    }

    override fun toString(): String {
        return this.value.toString()
    }
}

fun main() {
    val customInt: MyInt = MyInt(5)
    val customInt2: MyInt = MyInt(6)
    customInt add customInt2
    printVariable("customInt", customInt)

    val byteArray = byteArrayOf(1, 2, 3, 4, 5)
    val charArray = charArrayOf('a', 'b', 'c', 'd', 'e')
    val intArray = intArrayOf(250, 500, 750, 1000, 1250)
    val regularArray = arrayOf("Ahmet", "Mehmet", "Ayse", "Fatma", "Hayriye")
    val constArray = Array<String>(5) {
        "Item${it+1}"
    }
    printVariable(name = "byteArray", byteArray.joinToString())
    printVariable(name = "charArray", charArray.joinToString())
    printVariable(name = "intArray", intArray.joinToString())
    printVariable(name = "regularArray", regularArray.joinToString())
    printVariable(name = "constArray", constArray.joinToString())
}