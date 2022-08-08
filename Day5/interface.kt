package com.example_chap3

interface Account{
    val accountNumber:String
    val holder:String
    val balance:Double
    fun deposit(){

    }
    fun withdraw(){

    }
}
enum class week{
    a, b,c,d
}
fun main(){
    val day = week.a
    println(day)
    println(day  > week.b)
    println(day < week.b)
}