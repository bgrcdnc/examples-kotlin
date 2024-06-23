package org.example


fun main() {
//    Boolean
    println(" ---- Boolean ----")
    val isMale = true
    val isFemale = !isMale
    val isGenderFluid: Boolean? = null

    printType(isMale)
    printType(isFemale)
    printTypeNullable(isGenderFluid)

    println()

    printVariable("isMale", isMale)
    printVariable("isFemale", isFemale)
    printNullableVariable("isGenderFluid", isGenderFluid)
}