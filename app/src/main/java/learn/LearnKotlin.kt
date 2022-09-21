package learn

import kotlin.math.max

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

//语法糖：只有一行代码的时候，可以不用写函数体，直接用 = 相连即可

    fun largerNumber2(num1:Int,num2: Int) = max(num1,num2)