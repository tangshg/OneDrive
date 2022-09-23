package learn

import kotlin.math.max

/*
//语法糖：只有一行代码的时候，可以不用写函数体，直接用 = 相连即可

fun main () {

    /* print("hello kotlin")
     */

    val a= 10
    print("a=$a")//为什么打印要用＋号

    val num1=1
    val num2=2
    val max=largerNumber(num1,num2)

    print("\nlargerNumber=$max"  )

    val max2= largerNumber(num1,num2)
    print("max2=$max2")
}

    fun largerNumber(num1 : Int,num2:Int ):Int{
        return max(num1,num2)
    }

    fun largerNumber2(num1:Int,num2: Int) = max(num1,num2)
 */

/* kotlin中if的用法

fun main(){
    val num1 = 1
    val num2 = 2

    print("max_if=${largerNumber_if(num1, num2)}\n")
    print("max_if_kt=${largerNumber_if_kt(num1, num2)}\n")
    print("max_if_kt1=${largerNumber_if_kt1(num1, num2)}\n")
    print("max_if_kt2=${largerNumber_if_kt2(num1, num2)}\n")
}

fun largerNumber_if(
    num1:Int,
    num2:Int
):Int
{
    var max = 0
    if(num1>num2){
        max=num1
    } else{
        max=num2
    }
    return max
}


//kotlin的if语句自带返回值
fun largerNumber_if_kt(
    num1: Int,
    num2: Int
):Int
{
    //返回值：每条分支的最后一行代码的返回值
    var max= if (num1>num2){
        num1
    }else{
        num2
    }
    return max
}

//直接将if语句返回
    fun largerNumber_if_kt1(
    num1: Int,
    num2: Int
):Int
    {
        return if (num1>num2){
            num1
        } else {
            num2
        }
    }

//采用两个语法糖来精简函数

fun largerNumber_if_kt2(
    num1: Int,
    num2: Int
) = if (num1>num2)
    {
    num1
} else{
        num2
    }


 */