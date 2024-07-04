package org.example

class Colors {
    companion object {
        const val Reset: String = "\u001B[0m"
        const val Bold: String = "\u001B[1m"
    }

    class Background {
        companion object {
            const val Black: String = "\u001B[40m"
            const val Red: String = "\u001B[41m"
            const val Green: String = "\u001B[42m"
            const val Yellow: String = "\u001B[43m"
            const val Blue: String = "\u001B[44m"
            const val Magenta: String = "\u001B[45m"
            const val Cyan: String = "\u001B[46m"
            const val White: String = "\u001B[47m"
        }
    }

    class Foreground {
        companion object {
            const val Black: String = "\u001B[30m"
            const val Red: String = "\u001B[91m"
            const val Green: String = "\u001B[92m"
            const val Yellow: String = "\u001B[93m"
            const val Blue: String = "\u001B[94m"
            const val Magenta: String = "\u001B[95m"
            const val Cyan: String = "\u001B[96m"
            const val Gray: String = "\u001B[90m"
            const val White: String = "\u001B[98m"

            const val DarkRed: String = "\u001B[31m"
            const val DarkGreen: String = "\u001B[32m"
            const val DarkYellow: String = "\u001B[33m"
            const val DarkBlue: String = "\u001B[34m"
            const val DarkMagenta: String = "\u001B[35m"
            const val DarkCyan: String = "\u001B[36m"
            const val DarkGray: String = "\u001B[37m"
            const val DarkWhite: String = "\u001B[38m"
        }
    }
}

fun printVariable(name: String, value: Any) {
    val printColor = when (value::class.simpleName.toString()) {
        "Byte", "Short", "Int", "Long" -> Colors.Foreground.Blue
        "Double", "Float" -> Colors.Foreground.Cyan
        "Boolean" -> if (value == true) {
            Colors.Foreground.Black + Colors.Background.Green
        } else {
            Colors.Foreground.Black + Colors.Background.Red
        }
        "String" -> Colors.Foreground.Green
        "Char" -> Colors.Foreground.Magenta
        else -> Colors.Foreground.Gray
    }

    println(
        "'$name'" + " = '${printColor}$value${Colors.Reset}'"
    )

}

fun printNullableVariable(name: String, value: Any?) {
    var printColor = Colors.Foreground.Blue
    if (value == null) printColor = Colors.Foreground.Red

    println(
        "'$name'" + " = " + "'${printColor}$value${Colors.Reset}'"
    )
}

fun printType(value: Any) = println(
    "'${Colors.Foreground.Green}${value}${Colors.Reset}' " + "is " + "'${Colors.Foreground.Green}${value::class.simpleName}${Colors.Reset}'"
)

fun printTypeNullable(value: Any?) {
    val valueString = value ?: "Nullable"
    val valueColor = if(value == null) {
        Colors.Foreground.Red
    } else {
        Colors.Foreground.Blue
    }
    print("'${Colors.Foreground.Green}${value.toString()}${Colors.Reset}' is '${valueColor}$valueString${Colors.Reset}'")
}

fun String.decodeHex(): String {
    check(length % 2 == 0) { "Must have an even length" }
    return chunked(2).map { it.toInt(16).toByte() }.toByteArray().decodeToString()
}