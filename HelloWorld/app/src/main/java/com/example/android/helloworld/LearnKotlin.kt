package com.example.android.helloworld

import kotlin.math.max

fun main() {
    val student = Student("Jack", 19)
    doStudy(student)
}


fun doStudy(study: Study) {
    study.readBooks()
    study.doHomework()
}
