package com.example.android.helloworld

open class Person(val name: String, val age: Int) {
    fun eat() {
        println(name + " is eating. He " + age + " years old.")
    }
}