package org.example

object Foreground_ {
    const val Black: String = "\u001B[30m"
    const val Red: String = "\u001B[31m"
    const val Green: String = "\u001B[32m"
    const val Yellow: String = "\u001B[33m"
    const val Blue: String = "\u001B[34m"
    const val Magenta: String = "\u001B[35m"
    const val Cyan: String = "\u001B[36m"
    const val Gray: String = "\u001B[37m"
    const val White: String = "\u001B[38m"
}

object Background_ {
    const val Black: String = "\u001B[40m"
    const val Red: String = "\u001B[41m"
    const val Green: String = "\u001B[42m"
    const val Yellow: String = "\u001B[43m"
    const val Blue: String = "\u001B[44m"
    const val Magenta: String = "\u001B[45m"
    const val Cyan: String = "\u001B[46m"
    const val White: String = "\u001B[47m"
}

object Colors {
    const val Reset: String = "\u001B[0m"
    const val Bold: String = "\u001B[1m"
    val Foreground= Foreground_
    val Background= Background_
}

fun printType(value: Any) =
    println(
        "'${Colors.Foreground.Green}$value${Colors.Reset}' " +
        "is " +
        "'${Colors.Foreground.Green}${value::class.simpleName}${Colors.Reset}'"
)

fun printTypeTemplate(value: String, simpleName: String) =
    println(
        "'${Colors.Foreground.Green}$value${Colors.Reset}' " +
                "is " +
                "'${Colors.Foreground.Green}${simpleName}${Colors.Reset}'"
    )

fun String.decodeHex(): String {
    check(length % 2 == 0) { "Must have an even length" }

    return chunked(2)
        .map { it.toInt(16).toByte() }
        .toByteArray()
        .decodeToString()
}