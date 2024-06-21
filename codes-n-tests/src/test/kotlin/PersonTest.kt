import org.example.Person
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.util.*

class PersonTest {

    @Test
    fun createDefaultTest() {
        val test = Person()
        assertTrue(
            test.toString() == "Buğra Çalışkandinç, 27, Male", "Person class default constructor failed)"
        )
    }

    @Test
    fun updateNameTest() {
        val test = Person()
        val change = "Neslihan"
        test.updateName(change)
        assertTrue(
            test.getName() == change, "Person class updateName() failed)"
        )
    }

    @Test
    fun updateAgeTest() {
        val test = Person()
        val change: Byte = 29
        test.updateAge(change)
        assertTrue(
            test.getAge() == change, "Person class updateName() failed)"
        )
    }

    @Test
    fun updateAgeByYearTest() {
        val test = Person()
        val change: Int = 1994
        val age:Byte = ((Calendar.getInstance().get(Calendar.YEAR)).toInt() - change).toByte()
        test.updateAgeByYear(change)
        assertTrue(
            test.getAge() == age, "Person class updateName() failed)"
        )
    }
}