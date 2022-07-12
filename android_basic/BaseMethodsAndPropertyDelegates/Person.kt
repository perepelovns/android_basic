package class6

open class Person (var height: Double,var weight: Double,var name: String, var pets: HashSet<Animal>){

    fun buyPet () {
        var animal = Animal (
            energy = (0..100).random(),
            weight = (1..100).random(),
            name = ('a'..'z').random().toString()
        )
        pets.add(animal)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (height != other.height) return false
        if (weight != other.weight) return false
        if (name != other.name) return false
        if (pets != other.pets) return false

        return true
    }

    override fun hashCode(): Int {
        var result = height.hashCode()
        result = 31 * result + weight.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + pets.hashCode()
        return result
    }

    override fun toString(): String {
        return "Person(height=$height, weight=$weight, name='$name', pets=$pets)"
    }


}