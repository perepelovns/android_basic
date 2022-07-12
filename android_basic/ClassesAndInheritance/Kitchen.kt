package com.example.skillboxlesson1.class1

//public open class Kitchen: Room( 15.2) {
//
//    override var title = "Кухня"
//}

public open class Kitchen(area:Double): Room(area){
    override var title = "Кухня"

//    fun main () {
//        println("Введите число метров: ")
//        val area = readLine()?.toDoubleOrNull() ?: return
//    }
}