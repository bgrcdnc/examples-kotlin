package org.example

class EntryPoint(val name: String, val func: () -> Unit)

// simple function to get user credentials and salute
fun nameNSurname() {
    print("What is your name? < ")
    val name: String = readln()
    print("What is your surname, $name? < ")
    val surname: String = readln()

    var age: Int?
    do {
        print("What is your age, $name? < ")
        age = readln().toIntOrNull()
    } while (age == null)
    var gender: String? = null
    do {
        print("What is your gender, $name; (m)ale or (f)emale ? < ")
        when (readln()) {
            "m", "M" -> gender = "Male"
            "f", "F" -> gender = "Female"
        }
    } while (gender == null)

    print("Hello, $name $surname; aged $age, gender $gender")
}

fun playingWithTypes() {
    val name: String = "Buğra"
    val age: Int = 27
    val gender: Boolean = true // true: Male - false: Female
    val nationality: String = "Turkish"
    print("Hello, $name, $age, $gender, $nationality")
}

// A simple while loop in main() to allow user to select an entrypoint
fun main() {
    // list of entries by custom class object
    val entries = arrayListOf(
        EntryPoint("Name and Surname", ::nameNSurname), EntryPoint("Playing with Types", ::playingWithTypes)
    )

    // print the entries
    println("Entry points > ")
    for (i in 1..entries.size) { // simple foreach loop to run through entry items
        println("${i}) ${entries[i - 1].name}")
    }
    println()

    // get user input for selecting the entrypoint
    var userEntry: Int?
    do {
        print("Select entry point < ")
        userEntry = readln().toIntOrNull()
    } while ((userEntry == null) || (userEntry !in (1..entries.size)))

    // print a new line to announce the entry
    println("Selected entry > ${entries[userEntry - 1].name}")
    println() // to separate the entry outputs
    // and call the entry function
    entries[userEntry - 1].func()
}
