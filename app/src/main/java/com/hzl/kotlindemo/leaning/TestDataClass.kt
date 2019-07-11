package com.hzl.kotlindemo.leaning

//数据类
data class H(var name: String, var age: Int)

/**
 * 密封类
 * 使用 sealed 修饰类，密封类可以有子类，但是所有的子类都必须要内嵌在密封类中。
 * 使用密封类的关键好处在于使用 when 表达式 的时候，如果能够 验证语句覆盖了所有情况，就不需要为该语句再添加一个 else 子句了。
 * 类似泛型
 */
sealed class Compute
class Add:Compute()//加法
class Sub:Compute()//减法

fun cpt(cpt:Compute,v1:Int,v2:Int):Int =  when(cpt){
    is Add ->  v1 + v2
    is Sub -> v1 - v2
}

/***
 * 常见用法
 */
sealed class Operation {
    object Run:Operation()
    object Jump:Operation()
    object Drive:Operation()
}

fun operation(opt:Operation):String = when(opt){
    is Operation.Run -> "Run"
    is Operation.Jump -> "Jump"
    is Operation.Drive -> "Drive"
}

fun main() {
    var h = H(name = "zhangsan", age = 12)
    println("name = ${h.name}, age = ${h.age}")

    var (name,age) = h
    println("解构：$name : $age")

    println(cpt(Add(),12,13))
    println(cpt(Sub(),12,13))

    println(operation(Operation.Drive))
    println(operation(Operation.Run))
    println(operation(Operation.Jump))

}

