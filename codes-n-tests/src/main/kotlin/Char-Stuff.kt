package org.example

@OptIn(ExperimentalStdlibApi::class)
fun main() {
//  Boxed - Unboxed Char
    println(" ---- Char: Boxed/Unboxed ---- ")
    val c: Char = 'c'
    val boxedC: Char? = c
    val boxedC2: Char? = c
    println("c: $c") // c
    println("boxedC === boxedC2: ${boxedC === boxedC2}") // true

    // Char from int
    val charFromInt: Char = (65).toChar()
    println("charFromInt: $charFromInt")

    // Escape chars
    val escapes = "selam\b\bena"
    println("escapes: $escapes")

    // Unicode
    val unicodeChar = '\u2764'
    println("unicodeChar: ${Colors.Foreground.Red} $unicodeChar ${Colors.Reset}")

    // Strings
    println("\n ---- String ---- ")
    val str: String = "Hello, World!"
    println("str: $str")

    // Some fun stuff
    println("\n ---- Char.toNumber.toHexString ---- ")
    val testChar = 'A'
    println("testChar = A")
    println("Byte\t: " + testChar.code.toByte().toHexString())
    println("Short\t: " + testChar.code.toShort().toHexString())
    println("Int\t\t: " + testChar.code.toHexString())
    println("Long\t: " + testChar.code.toLong().toHexString())

//    Decode and Encode
    println("\n ---- Decode and Encode ---- ")

    val string = "Neslihan Can Çalışkandinç"
    val encodedString = string.toByteArray().toHexString()
    val decodedString = encodedString.decodeHex()

    println("string: $string")
    println("encodedString: $encodedString")
    println("decodedString: $decodedString")

}