package com.example_chap3

fun checkInput(number: Int){
    if(number > 0) println("Number is positive") else if (number < 0) println("Number is negative ") else println("Number is zero")
}
fun testNumberOddEven(number: Int){
    if (number % 2 == 0) println("Number is even ") else println("Number is odd")
}
fun Kilometres(number: Int) {
    println(number * 0.621371)
}
fun main(){
    print("Please input a number: ")
    val input = readLine() as String
    val number = input.toInt()

    checkInput(number)
    testNumberOddEven(number)
    Kilometres(number)


}