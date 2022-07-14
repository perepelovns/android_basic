fun main(){
    val array = intArrayOf(3, 23, 432, -1, 1256)
    println(array.toList())
    array.bubble()
    println(array.toList())
}

fun intArray.bubble(){
    var sorted = false
    while (!sorted){
        sorted = true
        for (i in 1 until this.size) {
            val privious = this[i - 1]
            val current = this[i]
            if (privious > current){
                this.swap(i - 1, i)
                sorted = false
            }            
        }
    }
}

fun intArray.swap(index1: Int, index2: Int){
    val buffer = this[index1]
    this[index1] = this[index2]
    this[index2] = buffer
}