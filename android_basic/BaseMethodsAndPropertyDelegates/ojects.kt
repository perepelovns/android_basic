package class6

fun main() {
    var person = Person(133.2, 75.378, "Ronin", pets = HashSet())
        var person1 = Person(133.2, 75.378, "Ronin", pets = HashSet())
        var person2 = Person(133.2, 75.378, "Ronin", pets = HashSet())
        var person3 = Person(185.2, 90.378, "Cha-cha", pets = HashSet())

    var persons = mutableSetOf<Person>(person1, person2)
    persons.add(person3)
    println(persons.size)

    persons.forEach{ println(it) }
    persons.forEach { it.buyPet() }

}