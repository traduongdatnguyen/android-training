package com.example_chap3

class Day3( private val _name:String = "Nguyen", val _age: Int) {
    constructor(id:Int, _name: String, _age: Int):this(_name,_age){

    }
    fun printName(){
        println("hi $_name")
    }
}

class AccountUser(val _numberAccount: String , val _nameUser: String, var _balance: Double, val _typesAcount: String ){
    var balance = 0.0
    init {
        println("'$_numberAccount', '$_nameUser', $_balance, type='$_typesAcount'")
    }

    fun deposit(holderAcount: Double): Double{
        if (holderAcount != null){
            balance = holderAcount + _balance
        }


        return balance
    }

    fun withdraw(holderAcount: Double): Double{
        if (holderAcount != null){
            balance -= holderAcount
        }
        return balance
    }
    fun getBalance(){
        println("balance: $balance ")
    }
}

//getter and setter
class Girl {
    var age: Int = 0
        get() = field
        set(value) {
            field = if (value < 18)
                18
            else if (value >= 18 && value <= 30)
                value
            else
                value-3
        }

    var actualAge: Int = 0
}
object MathUtils{
    override fun toString(): String {
        return super.toString()
    }
}
fun main(){
    val acc1 = AccountUser("123", "John", 10.05, "current")
    val acc2 = AccountUser("345", "Denise", 23.55, "savings")
    val acc3 = AccountUser("567", "Phoebe", 12.45, "investment")
    println(acc1)
    println(acc2)
    println(acc3)
    acc1.deposit(23.45)
    acc1.withdraw(12.33)
    println("balance: ${acc1.balance}")

    //getter and setter
    val maria = Girl()
    maria.actualAge = 15
    maria.age = 15
    println("Maria: actual age = ${maria.actualAge}")
    println("Maria: pretended age = ${maria.age}")
}
