package com.example_chap3
import kotlin.random.Random
val numberToGuess = Random.nextInt(0, 5)

fun numbertoGuessFun(a:Int){
    var intGuess:Int
    intGuess = a
    var countNumberOfTries = 1
    while (numberToGuess != intGuess) {
        println("Sorry wrong number")
        if (countNumberOfTries == 4) {
            break
        } else if (intGuess < numberToGuess) {
            println("Your guess was lower than the number")
        } else {
            println("Your guess was higher than the number")
            print("Please guess again between 1 and 10: ")
            val guess = readLine() ?: ""
            intGuess = guess.toInt()
            countNumberOfTries++
        }
        if (numberToGuess == intGuess) {
            println("Well Done You Won!")
            println("You took $countNumberOfTries goes to complete the game")
        } else {
            println("Sorry - You Loose")
            println("The number you needed to guess was $numberToGuess")
        }
        println("Game Over")
    }
}
fun main() {
    println("Welcome to the number guess game")
    print("Please guess a number between 1 and 10: ")
    var intGuess: Int
    do {
        val guess: String = readLine() ?: ""
        intGuess = guess.toInt()
        if (intGuess < 0){
            println("You were enter $intGuess")
            println("Please re-enter")
        }
    }while (intGuess < 0)
    if (intGuess >= 0){
        numbertoGuessFun(intGuess)
    }

}