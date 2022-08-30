package com.example_chap3

class DataArrays(val arrs : Array<Students>) {
    var family: Array<Array<String>>
   init {
       family = arrayOf (
           arrayOf("John", "Denise", "Phoebe", "Adam"),
           arrayOf("Paul", "Fi", "Andrew", "James")
       )
   }
    fun showView(){
        println(arrs)
        val family0 = family[0]
        for (name in family0) {
            println(name)
        }
        println()
        family[0][2] = "Jasmine"
        for (name in family[0]) {
            println(name)
        }
        println(family0.size)
        println("first(): ${family0.first()}")
        println("last(): ${family0.last()}")
        println("copyOf(): ${family0.copyOf()}")
        println("sliceArray(2..3): ${family0.sliceArray(2..3)}")

    }
}
data class Students(val iD:Int, val name:String)
fun main(){

    val dataArrays = DataArrays(arrayOf(Students(5,"nguyen")))
    dataArrays.showView()
}