fun main() {
    val people = mutableListOf(
        "Alok" to 30,
        "Akash" to 25,
        "Chandu" to 35,
        "Dev" to 20
    )

    
    val sorted = { people: MutableList<Pair<String, Int>> ->
        val n = people.size
        for (i in 0 until n - 1) {
            for (j in 0 until n - i - 1) {
                if (people[j].second > people[j + 1].second) {
    
                    val temp = people[j]
                    people[j] = people[j + 1]
                    people[j + 1] = temp
                }
            }
        }
    
        people
    }

    
    
    println(sorted(people))
}
