package ktFun

fun num1AndNum2(num1:Int,num2:Int,operation:(Int,Int)->Int):Int {
    //operation 只是参数名，只要符合参数与返回值的函数，都可以传入 num1AndNum2() 函数
    val result = operation(num1,num2)
    return result
}

fun plus (num1:Int, num2 :Int):Int{
    return num1+num2
}

fun minus (num1: Int,num2 :Int):Int{
    return num1-num2
}

//使用高阶函数

fun main() {
    val n1 = 100
    val n2 = 200

    val result1 = num1AndNum2(n1, n2, ::plus)
    val result2 = num1AndNum2(n1, n2, ::minus)
    println("plus $result1")
    println("minus $result2")

    //使用 lambda 表达式
    val result3 = num1AndNum2(n1, n2) { n1, n2 ->
        n1 + n2
    }
    val result4 = num1AndNum2(n1, n2) { n1, n2 ->
        n1 - n2
    }
    println("lambda plus $result3")
    println("lambda minus $result4")

    val lam = { n1: Int, n2: Int -> n1 + n2 }
    val result5 = num1AndNum2(n1, n2, lam)
    println("$result5")
    val result6 = num1AndNum2(n1, n2, { n1: Int, n2: Int -> n1 + n2 })
    println("$result6")
    val result7 = num1AndNum2(n1, n2) { n1, n2 ->
        n1 + n2
    }
    println("$result7")
    val result8 = num1AndNum2(n1, n2, {n1,n2->n1+n2})
    println("$result8")

}

