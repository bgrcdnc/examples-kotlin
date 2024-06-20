package org.example

fun main(args: Array<String>) {
    println("Hello, World!\n")

    print("Langs supplied by arguments: ")
    for (lang in args) {
        print("$lang ")
    }
}