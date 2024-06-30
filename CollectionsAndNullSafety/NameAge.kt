data class Person(val name: String, val age: Int)


fun bubbleSort(persons: MutableList<Person>) {
    val n = persons.size

    for (i in 0 until n - 1) {
        

        for (j in 0 until n - i - 1) {
            val person1 = persons[j]
            val person2 = persons[j + 1]

            
            if (person1.age > person2.age || (person1.age == person2.age && person1.name > person2.name)) {
            
                val temp = persons[j]
                persons[j] = persons[j + 1]
                persons[j + 1] = temp

                
            }
        }

        
        
    }
}

fun main() {
    val persons = mutableListOf(
        Person("alok", 30),
        Person("akash", 25),
        Person("neha", 25),
        Person("david", 35),
        Person("virat", 30)
    )

    bubbleSort(persons)

    persons.forEach { println(it) }
}
