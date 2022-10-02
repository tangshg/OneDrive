package anonymous

//在 kotlin 中实现 B类中的 fun()方法

fun main(){
    //基本方式实现
    val b = B()
    val almpl : Almpl = Almpl()
    val a = almpl
    b.myFun (a)

    //匿名内部类的方式
    val b1 : B = B()
        b1.myFun(object : A{
            override fun doSomething() {
            println("kotlin 中的匿名内部类")
            }
        })

    //原生 lambda 这里使用的内部类写法
    val a1 =  A{
            println("kotlin 中的匿名内部类")
    }
    val b2 = B()
    b2.myFun (a1)

    //lambda 表达式
    val b3 : B = B()
    b3.myFun {
        println("精简后的 lambda 表达式")
    }
}

class KotlinTest {

}