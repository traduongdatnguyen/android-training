package com.example_chap3

fun checkInput(number: Int){
    if(number > 0) println("Number is positive") else if (number < 0) println("Number is negative ") else println("Number is zero")
}
fun testNumberOddEven(number: Int){
    if (number % 2 == 0) println("Number is even ") else println("Number is odd")
}
fun Kilometres(number: Int) {
    println(number * 0.621371)
    if((number > 2) && (number >10)){
        println("ok")
    }
}
fun factorial(number: Int) {
    var factorial = 1
    if (number == 0 || number == 1) println("$number! factorial is 1") else if(number > 1){
        for (i in 2..number){
            factorial *= i
        }
        println("$number! factorial is $factorial")
    }else{
        println("Factorial is not defined for negative numbers")
    }
}
fun checkNumber(){
    var number:Int
    do {
        number = readLine()!!.toInt()
        if (number < 1){
            println("Nhập lại")
        }
    }while (number < 1)

    while ( number >= 1){
        println("ok")
        break
    }
}
val sumLambda = {a : Int, b:Int -> println(a*b)}
val increment: (Int) -> Int = { x -> x + 1 }
val increase = { x: Int -> x + 1 }
fun main(){
//    print("Please input a number: ")
//    val input = readLine() as String
//    val number = input.toInt()
//    var nullableVar: String? = ""
//    val result = if (nullableVar == null) -1 else nullableVar.length
//    println("result: $result")
//
//    checkInput(number)
//    testNumberOddEven(number)
//    Kilometres(number)
//    factorial(number)

//    checkNumber()
    sumLambda(2,5)
    println(increment(5))
    println(increase(5))
}