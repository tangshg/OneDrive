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
    //lambda 表达式
    val b2 : B = B()
    b2.myFun {
        println("lambda 表达式")
    }
}

class KotlinTest {

}