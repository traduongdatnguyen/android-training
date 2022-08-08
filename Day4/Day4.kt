package com.example_chap3

//scope function
class Student(var name: String, var age: Int){
    fun myName(name: String):String = "My name is $name"
    fun myAge(age: Int):String = " I'm $age years old"
}

open class Person(age: Int, name: String) {
    init {
        println("My name is $name.")
        println("My age is $age")
    }
}

class MathTeacher(age: Int, name: String): Person(age, name) {

    fun teachMaths() {
        println("I teach in primary school.")
    }
}

class Footballer(age: Int, name: String): Person(age, name) {
    fun playFootball() {
        println("I play for LA Galaxy.")
    }
}

fun main(args: Array<String>) {
    val t1 = MathTeacher(25, "Jack")
    t1.teachMaths()

    println()

    val f1 = Footballer(29, "Christiano")
    f1.playFootball()
    
    
    //scope funtion
        val student : Student = Student("Đạt Nguyên", 21)

    val result = student.run {
        name = "Trà Dương Đạt Nguyên"
        myName(name + myAge(22))
    }

    val studentLet :Student = Student("Đạt Nguyên",21)
    val resultLet = studentLet.let {
        println(it)
        it.name= "Trà Dương Đạt Nguyên"
        it.age = 22
        it.myName(it.name + it.myAge(22))
    }
    println(result)
    println(resultLet)
}






