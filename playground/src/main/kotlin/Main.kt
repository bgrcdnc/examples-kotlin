package org.example

fun main() {
    nameNSurname()
}

fun nameNSurname () {
//    print("What is your name? : ")
    val name: String = "Buğra" // readln()

//    print("What is your surname, $name? : ")
    val surname: String = "Çalışkandinç" // readln()

//    print("What is your age, $name? : ")
    val age: Int = 27 // readln().toInt()

//    print("What is your gender, $name? (True: Male, False: Female) : ")
    val gender: Boolean = true // readln().toBoolean()

    print("Hello, $name $surname; aged $age, gender ")
    if(gender) print("Male")
    else print("Female")
}

