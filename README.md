# kotlinDemo
## This project contains all the code i exercised!

## 主要的练习内容
>  
> * 方法声明，参考<https://www.runoob.com/kotlin/kotlin-basic-syntax.html>  


   > 1.声明方式  

    fun name(p1: pType,p2: pType): returnType{
        return returnTypeValue;
     }  
   > 2.不明确返回类型：  

    fun sum(a: Int, b: Int) = a + b  
   > 3.可变长参数： 
        
    fun vars(vararg v:Int){
        for(vt in v){
            print(vt)
        }
    }  
    // 测试  
    fun main(args: Array<String>) {
        vars(1,2,3,4,5)  // 输出12345
    }     
    
   > 4.lambda(匿名函数)：   

    // 测试  
    fun main(args: Array<String>) {
       val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
       println(sumLambda(1,2))  // 输出 3
    }
    
    
