package org.example

import java.util.*

enum class Genders {
    Male, Female;

    override fun toString(): String {
        if (this == Male) return "Male"
        else if (this == Female) return "Female"
        return "ERROR"
    }
}

class Person {
    private var name = createName()
    private var surname = createSurname()
    private var age = createAge()
    private var gender = createGender()

    private fun createName(): String {
        val name = "Buğra"
        return name
    }

    private fun createSurname(): String {
        val surname = "Çalışkandinç"
        return surname
    }

    private fun createAge(): Byte {
        val age: Byte = 27
        return age
    }

    private fun createGender(): Genders {
        val gender = Genders.Male
        return gender
    }

    fun getName(): String {
        return this.name
    }

    fun getSurname(): String {
        return this.surname
    }

    fun getAge(): Byte {
        return this.age
    }

    fun getGender(): Genders {
        return this.gender
    }

    fun updateName(newName: String) {
        this.name = newName
    }

    fun updateSurname(newSurname: String) {
        this.surname = newSurname
    }

    fun updateAge(newAge: Byte) {
        this.age = newAge
    }

    fun updateAgeByYear(year: Int) {
        this.age = ((Calendar.getInstance().get(Calendar.YEAR)).toInt() - year).toByte()
    }

    fun updateGender(newGender: Genders) {
        this.gender = newGender
    }

    fun update(newName: String, newSurname: String, newAge: Byte, newGender: Genders) {
        this.name = newName
        this.surname = newSurname
        this.age = newAge
        this.gender = newGender
    }

    fun updateByYear(newName: String, newSurname: String, year: Int, newGender: Genders) {
        this.updateName(name)
        this.updateSurname(surname)
        this.updateAgeByYear(year)
        this.updateGender(gender)
    }

    override fun toString(): String {
        return "$name $surname, $age, $gender"
    }
}

fun main() {
    val person = Person()
    println(person)
    person.update("Neslihan", "Can Çalışkandinç", 29, Genders.Female)
    print(person)
}