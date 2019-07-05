package com.hzl.kotlindemo.leaning

/**
 * 数据类型和应用
 */
fun main() {
    testDataFormat()
    testCompare()
    testConvert()
    testBitOperate()
    testArray()
    testString()
}

/**
 * 字符串
 */
private fun testString(){
    var str = "hello"
    for (s in str){//遍历字符串
        print("$s ")
    }
    println()

    var str2 = """ //多行字符串
        |hello
        |world
        |is
        |good
    """.trimMargin()
    println(str2)

    var str3 = """ // 输出美元符号
        ${'$'}10
    """.trimIndent()
    println(str3)

}

/**
 * 数组
 */
private fun testArray() {
    var arr = arrayOf(1,2,3)
    println("arr[0] = ${arr[0]}")
    var size = arr.size-1
    for(i in 0..size){
        print("${arr[i]} ")
    }
    println()

    println("========================================")
}

/**
 * 位移操作:
            shl(bits) – 左移位 (Java’s <<)
            shr(bits) – 右移位 (Java’s >>)
            ushr(bits) – 无符号右移位 (Java’s >>>)
            and(bits) – 与
            or(bits) – 或
            xor(bits) – 异或
            inv() – 反向
 */
private fun testBitOperate() {
    var a = 1
    var result = a.shl(1)//左移一位
    println("1 左移一位结果为：$result")

    println(a.shr(3))//右移一位
    println(a.ushr(2))//无符号右移
    println("1 反向的结果：${a.inv()}")//反向

    var v = false
    var n = true
    println(v.or(n))//或操作
    println(v.and(n))//与操作

    println("================================================")
}

/**
 * 数据类型转换
 * 所有的数据类型都支持以下类型转换方法:
            toByte(): Byte
            toShort(): Short
            toInt(): Int
            toLong(): Long
            toFloat(): Float
            toDouble(): Double
            toChar(): Char
 */
private fun testConvert() {
    var a = "12"
    var b = 12
    var c = 1L + b //自动转为 Long 类型
    println(a.toInt())
    println(c)

    println("================================================")
}

/**
 *  Kotlin 中没有基础数据类型，只有封装的数字类型，你每定义的一个变量，其实 Kotlin 帮你封装了一个对象，这样可以保证不会出现空指针。
 *  数字类型也一样，所有在比较两个数字的时候，就有比较数据大小和比较两个对象是否相同的区别了。
 *  在 Kotlin 中，三个等号 === 表示比较对象地址，两个 == 表示比较两个值大小。
 */
private fun testCompare() {
    var a = 1000
    var b = 1000
    println("a = 1000,b = 1000;a == b: ${a==b}; a === b: ${a===b}" )

    //经过了装箱，创建了两个不同的对象
    var c:Int? = a
    var d:Int? = a
    println("c = a,d = a;c == d: ${c==d}; c === b: ${c===d}") // 值相等，对象地址不一样

    println("================================================")
}

/**
 * 数据结构
 */
private fun testDataFormat(){
    var price = 100_100.00//数字可以用下划线分割，方便阅读 输出：100100.0
    println(price)

    var creditCardNumber = 1000_5555_6666_7777L // Long类型 输出：1000555566667777
    println(creditCardNumber)

    var hexNumber = 0xff_ec_df //16进制 kotlin不支持8进制
    println(hexNumber)

    var byteNumber = 0b0000_0000_0001 // 输出：1
    println(byteNumber)

    println("================================================")
}