package org.example

class EntryPoint(val name: String, val func: () -> Unit)

// simple function to get user credentials and salute
fun nameNSurname() {
    print("What is your name? < ")
    val name: String = readln()
    print("What is your surname, $name? < ")
    val surname: String = readln()
    print("What is your age, $name? < ")
    val age: Int = readln().toInt() // TODO: validate input before casting
    print("What is your gender, $name? < ")
    val gender: String = readln()

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
    // to keep the loop going until a proper entry is selected
    var entryDone = false
    while (!entryDone) {
        // list of entries by custom class object
        val entries = arrayListOf(
            EntryPoint("Name and Surname", ::nameNSurname), EntryPoint("Playing with Types", ::playingWithTypes)
        )

        // print the entries
        var i = 1
        println("Entry points > ")
        for (e in entries) { // simple foreach loop to run through entry items
            println("${i++}) ${e.name}")
        }
        println()

        // get user input for selecting the entrypoint
        print("Select entry point < ")
        val userEntry: Int = readln().toInt() // TODO: validate input before casting

        // if user entry index is between the first and last items in entries
        if (userEntry > 0 && userEntry <= entries.size) {
            // then set the flag to terminate the loop on the next run
            entryDone = true
            // print a new line to announce the entry
            println("Selected entry > ${entries[userEntry - 1].name}")
            println() // to separate the entry outputs
            // and call the entry function
            entries[userEntry - 1].func()
        } else print("Input error: Selected entry out of bounds") // print in case of user input error
    }
}
