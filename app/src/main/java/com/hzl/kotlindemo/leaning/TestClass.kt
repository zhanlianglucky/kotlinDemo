package com.hzl.kotlindemo.leaning


/**
 * 参考资料 https://www.runoob.com/kotlin/kotlin-class-object.html
 */
class Person {
    var name: String = "zhangsan"
        get() = field.toUpperCase()  //定制get方法

    var age = 0   //默认实现get()和set()

    var weight = 120.0
        private set   // 设置set方法不可用

}

/**
 * 带构造函数的类
 */
class Car(type: String = "2",name: String = "张三") {
    var type = ""
    var name = ""

    init {
        this.type = type
        this.name = name
    }
}

/**
 * 内部构造函数
 */
class Computer {
    var with = 0
    var height = 0
    constructor(with: Int = 11, height: Int = 12) {
        this.with = with
        this.height = height
    }
}

/**
 * 抽象类
 */
abstract class BaseMachine {
    abstract fun getType():Int
}

open class Monitor: BaseMachine() { // 用 open 修饰的类才能继承
    override fun getType():Int {
        return 666
    }
}

class Mouse : Monitor()//类默认是用final修饰

/**
 * 内部类
 */
class A {
    class B {
        fun print() {
            println("print class B!")
        }
    }
}


fun main() {
    testClass()//普通类
    testAbstract()//抽象类
}

fun testAbstract() {
    var m = Monitor()
    println(m.getType())
    println(Mouse().getType())

    A.B().print()//内部类
}


fun testClass() {
    var person = Person()
    println(person.name)
    println(person.age)
    println(person.weight)

    var car = Car("1")
    println("car: type = ${car.type}  name = ${car.name}")

    var computer = Computer(height = 90)//用起来就是这么灵活
    println("computer: with = ${computer.with}  height = ${computer.height}")

}
