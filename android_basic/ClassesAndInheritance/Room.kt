package com.example.skillboxlesson1.class1

public open class Room constructor(
    private val area: Double,
    protected open var title: String = "Обычная комната") {

    fun getDescription () {
            println("Название комнаты: $title, её площадь: $area м^2")
    }
}