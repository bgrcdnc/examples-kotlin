package org.example

fun main() {
//    Boolean
    println(" ---- Boolean ----")
    val isMale = true
    val isFemale = !isMale
    val isGenderFluid: Boolean? = null

    printType(isMale)
    printType(isFemale)
    // printType(isGenderFluid) -> nullable, so...
    printTypeTemplate("isGenderFluid", "Boolean?")

    println()

    println(
        "isMale: $isMale\n" +
        "isFemale: $isFemale\n" +
        "isGenderFluid: $isGenderFluid"
    )
}