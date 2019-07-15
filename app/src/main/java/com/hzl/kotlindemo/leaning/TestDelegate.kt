package com.hzl.kotlindemo.leaning

import kotlin.properties.Delegates

//代理实现方式

//接口
interface InL {
    fun print()
}
//接口实现类
class L(var info:String) :InL {
    override fun print() {
        println(info)
    }
}
//通过关键字 by 绑定
class M(inl:InL) : InL by inl

//延迟属性
/**
lazy() 是一个函数, 接受一个 Lambda 表达式作为参数, 返回一个 Lazy <T> 实例的函数，
返回的实例可以作为实现延迟属性的委托： 第一次调用 get() 会执行已传递给 lazy() 的 lamda 表达式并记录结果，
后续调用 get() 只是返回记录的结果
 **/
val lazyValue:String by lazy {
    println("执行lazy方法体")
    "执行 return value"
}

//可观察属性 Observable 对属性变化进行观察
class N {
    var name:String by Delegates.observable("初始值"){
        property, oldValue, newValue ->
        println("属性$property : oldValue = $oldValue : newValue = $newValue")
    }
}

//把属性储存在映射中
class O (val map:Map<String,Any?>){
    val name:String by map
    val url:String by map
}

class P (val map:MutableMap<String,Any?>){
    val name:String by map
    val url:String by map
}

fun main() {

    var mm:MutableMap<String,Any?> = mutableMapOf(
        "name" to "lisi",
        "url" to "http://www.wy.com"
    )
    var mp = P(mm)
    println("default mutable map: name = ${mp.name} : url = ${mp.url}")
    mm.put("name","wangwu")//修改可变map值
    mm.put("url", "http://www.souhu.com")
    println("update mutable map: name = ${mp.name} : url = ${mp.url}")

    var m = O(mapOf(
        "name" to "zhangsan",
        "url" to "http://www.baidu.com"
    ))
    println("map映射: name = ${m.name} : url = ${m.url} ")
    println("=======================================")

    var n = N()
    n.name = "zhangsan"
    n.name = "lisi"
    println("=======================================")

    println(lazyValue)//第一次，执行方法体
    println(lazyValue)//第二次，只执行返回，不执行方法体
    println("=======================================")

    var inl = L("L 实现类")
    M(inl).print()

}