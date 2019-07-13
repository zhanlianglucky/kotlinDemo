package com.hzl.kotlindemo.leaning

open class I //可被继承类
interface J //接口

class K {
    var time = "12:00"
    fun obj() = object {
        var name: String = "K1"
    }

    private fun obj2() = object { //正确写法
        var name: String = "K2"
        var cTime: String = time//访问类属性
    }

    object OK{//类内部对象 通过 外部类名. 调用
        var type:String = "class K 内部 object OK"
        fun test(){
            //不能访问外部类的属性和方法
        }
    }

    //注意：一个类里面只能声明一个内部关联对象，即关键字 companion 只能使用一次。
    //伴生对象的成员看起来像其他语言的静态成员，但在运行时他们仍然是真实对象的实例成员。例如还可以实现接口
    companion object COK {//伴生对象 可以通过外部类名直接调用内部伴生对象的属性和方法
        var type:String = "class K 内部伴生对象 companion object COK"
        fun test() {
            println(type)
        }
    }

    fun test(): String {
        return "name = ${obj2().name} ; time = ${obj2().cTime}"
    }
}

object AA { //对象单例
    var name: String = "object AA"
}


//对象表达式
fun main() {

    K.test()//可以通过类名直接调用内部伴生对象的属性和方法

    println(K.OK.type)//类内部对象调用方式

    var a = AA //单例测试
    var b = AA
    a.name = "lisi"
    println("a.name = ${a.name} ; b.name = ${b.name}")


    var k = K()
//    k.obj().name  //访问不到name
    println(k.test())


    var i = object : I(), J {//继承和实现接口
        var name: String = "i"
    }
    println("name = ${i.name}")


    var o = object { //匿名对象类
        var name: String = "zhangsan"
        var age: Int = 18
    }
    println("name = ${o.name} ; age = ${o.age}")


}
