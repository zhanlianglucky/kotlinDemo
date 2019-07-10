package com.hzl.kotlindemo.leaning

/**
 * 扩展函数
 * */

class G {
    class Companion//内部类
    fun print(str:String){//如果外部方法，和内部方法一致，则只执行内部方法
        println("内部方法：$str")
    }
}

fun main() {
    // 1.给G类加函数,api里的类也支持执行此操作
    fun G.print(str:String){
        if (this == null) return  // 判断调用对象是否为null
        println("外部方法：$str")
    }
    G().print("function")

    // 2.给list换位置
    fun MutableList<Int>.swap(index1:Int,index2:Int){
        var temp = this[index1]
        this[index1] =this[index2]
        this[index2] = temp
    }
    var list = mutableListOf<Int>(1,2,3)
    list.swap(0,2)
    println(list.toString())

    // 3.内部类方法扩展
    fun G.Companion.log(){
        println("G.Companion.log()")
    }
    G.Companion().log()


}