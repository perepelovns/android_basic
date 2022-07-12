package com.example.skillboxlesson1.class1

    fun main(args: Array<String>) {
        val rooms = listOf<Room>(
            Kitchen(10.1),
            Living(20.2),
            ChildRoom(3.21),
            FreeRoom(75.2, "Свободная комната"),
            BedRoom(15.2),
            BathRoom(45.7)
        )
        rooms.forEach {
            it.getDescription()
        }

    }