package com.hzl.kotlindemo.leaning

/***
 * 枚举
 */
enum class Number(num:Int){
    ONE(1),TWO(2),THREE(3),
}


fun main() {
    var num = Number.ONE

    println(Number.values())
    println(Number.valueOf("ONE"))
    println(num.name)
    println(num.ordinal)

    when(num){
        Number.ONE->println("value = ${num.ordinal}")
        Number.TWO->println("value = ${num.ordinal}")
        Number.THREE->println("value = ${num.ordinal}")
    }

}