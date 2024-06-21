package org.example

import java.util.*

fun main() {
    var name: String? = null
    var age: Int? = null
    var num = null
//    num = 5 // Cannot assign to Nothing? // Always null

    age = 5
    name = "Bugra"
    print("${name.lowercase(Locale.getDefault())}, ${5 + age}, $num")
}