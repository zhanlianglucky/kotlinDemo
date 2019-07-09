package com.hzl.kotlindemo.leaning

/**
 * Kotlin 中所有类都继承该 Any 类，它是所有类的超类，对于没有超类型声明的类是默认超类：
 * 一个类或者对象可以实现一个或多个接口。
 * 单继承模式
 */

open class C(var name: String) {
    open fun print() {
        println("class C")
    }
}

class D(name: String, var age: Int) : C(name)

interface F {
    fun print() {
        println("class F")
    }

    fun test()
}

/**
 * 接口+继承
 */
class E : C, F {
    constructor(name: String, age: Int) : super(name)

    override fun print() {
        super<F>.print()
        super<C>.print()
        println("class E")
        test()
    }

    override fun test() {
        println("F test()")
    }

}

/**
 * 继承关系
 */
fun main() {
    testExtends()
}

fun testExtends() {

    var d = D("zhangsan", 12)
    println("name = ${d.name} age = ${d.age}")

    var e = E("zhangsan", 12)
    println(e.name)
    e.print()
}