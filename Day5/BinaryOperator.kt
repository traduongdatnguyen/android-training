package com.example_chap3
interface BinaryOperator {
    fun apply(t: Int, u: Int): Int = t * u
    fun applyAsInt(t: Int, u: Int) = apply(t, u)

}
