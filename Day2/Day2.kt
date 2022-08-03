package com.example_chap3

////
fun prime(number: Int){
    var count: Int = 2
    while (count <= number) {
        var flag = false
        for (i in 2..count / 2) {
            if (count % i == 0) {
                flag = true
                break
            }
        }
        if (!flag)
            println("Prime number $count")
        count++
    }
}


/////
fun myHigherOrderFunction(number: Int, func: (Int) -> Int) : Int{
    return func(number)
}
fun doubler(i : Int) = i * 2

fun tripler(i: Int) = i * 3



////
fun curry(number: Double, func: (Double,Double) -> Double):(Double) -> Double{
    val number = number.toDouble()
    return fun (y:Double) = func(number,y)
}
fun convert(amount: Double, rate: Double) = amount * rate




fun main(){
    var number: Int

    do {
        print("Please input a number: ")
        number = readLine()!!.toInt()
        if (number < 2){
            println("Please re-enter!")
        }
    }while (number < 2)

    if (number >= 2){
        prime(number)
    }
    ///
    println(myHigherOrderFunction(number, ::doubler))
    println(myHigherOrderFunction(number,::tripler))



    ///
    val dollarsToSterling = curry(0.77, ::convert)
    println(dollarsToSterling(5.0))
    val euroToSterling = curry(0.88, ::convert)
    println(euroToSterling(15.0))
    val sterlingToDollars = curry(1.3, ::convert)
    println(sterlingToDollars(7.0))
    val sterlingToEuro = curry(1.14, ::convert)
    println(sterlingToEuro(9.0))

}