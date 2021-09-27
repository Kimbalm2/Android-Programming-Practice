fun main() {
   val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
   val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
    .shuffled()
    .take(2)
    .sorted()
    println(filteredWords)
}


fun examples(){
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    val setOfNumbers = numbers.toSet()
    val set1 = setOf(1,2,3)
    val set2 = mutableSetOf(3,2,1)
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    val filteredNames = peopleAges.filter { it.key.length < 4 }
    val triple: (Int) -> Int = { a: Int -> a * 3 }
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })
    println(peopleNames.sorted())
    println(triple(5))
    println(filteredNames)
    println(peopleAges)
    //peopleAges.forEach { print("${it.key} is ${it.value}, ") }
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )
    println("list:   ${numbers}")
    println("set:    ${setOfNumbers}")
    println("$set1 == $set2: ${set1 == set2}")
    println("$set1 == $set2: ${set1 == set2}")
}