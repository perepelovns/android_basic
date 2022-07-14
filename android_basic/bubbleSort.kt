package com.example.test00

import org.junit.Assert.*
import org.junit.Test

fun main(){
    val array = intArrayOf(43, 322, -2, 23, 1, 0)
    println("Вот такой вот массив был: ${array.toList()}")
    array.bubble()
    println("А вот что получилось: ${array.toList()}")
}

fun IntArray.bubble(){
    var sorted = false
    while (!sorted){
        sorted = true
        for (i in 1 until this.size) {
            val priv = this[i - 1]
            val cur = this[i]
            if (priv > cur){
                this.swap(i - 1, i)
                sorted = false
            }
        }
    }
}

fun IntArray.swap(index1: Int, index2: Int){
    val buffer = this[index1]
    this[index1] = this[index2]
    this[index2] = buffer
}