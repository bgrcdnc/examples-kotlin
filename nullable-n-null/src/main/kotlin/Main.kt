package org.example

fun main() {
    var name: String? = null
    var age: Int? = null
    var num = null
//    num = 5 // Cannot assign to Nothing?

    age = 5
    name = "Bugra"
    print("${name?.toLowerCase()}, ${5 + age!!}, $num")
}