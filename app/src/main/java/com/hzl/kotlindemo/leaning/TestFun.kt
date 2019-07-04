package com.hzl.kotlindemo.leaning

//方法声明 fun
fun main() {
    testFor()
}

//循环
private fun testFor() {
    for (i in 0 until 20) print("$i ")
    println("")
    for(i in 1..5) print("$i ")
    println("")
    for(i in 1..10 step 2) print("$i ")
    println("")
    for(i in 10 downTo 1 step 2) print("$i ")//降序
}


//字符串
private fun testString() {
    var a = 12
    var str = "a = $a"
    println(str)
    println(str.replace('a','b'))

    var age = null
//    var ages = age!!.toInt()//ages为空抛异常
    var ages2 = age?.toInt() ?: -1

    println(ages2)

    println(getStringLength("string"))

}

private fun test() {

    println("1 + 2 = ${add(1, 2)}")

    var sum: (Int, Int) -> Int = { a, b -> a + b }//等价于add函数
    println("3 + 4 = " + sum(3, 4))

    println("2 - 4 = ${sub(2, 4)}")

    println("平均为：${avg(1.2f, 1.4f)}")

    val a = 13 //val 修饰常量
    var b = 14 //var 不限类型的变量，自动识别

    println(a+b)

}

//不限类型参数
fun getStringLength(obj:Any):String {
    if (obj is String){
        return "str.length = ${obj.length}"
    }
    return "-1"
}


//带参数带返回值的方法
fun add(a: Int, b: Int): Int {
    return a + b
}

//减法
fun sub(a: Int, b: Int) = a - b

//多参数  求平均
fun avg(vararg f: Float): Double {
    /* f.size
     f.sum()
     f.iterator()
     f[0]
     f.set(0,1.0f)
     var list = f.asList()
     */
    for (fv in f) {
        print("参数：$fv ")
    }

    return f.average()
}

