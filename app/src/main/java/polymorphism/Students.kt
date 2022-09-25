package polymorphism

import learn.Study

fun main(){

    //小明和小红都是学生类的继承者，都调用readBook方法，结果却不一样，这就是多态
    //1、父类引用指向子类 2、子类重写方法
    val xiaoming:Students = XiaoMing()
    val xiaohong:Students = XiaoHong()

    xiaoming.readBook()
    xiaohong.readBook()

}

//接口Study的实现类

open class Students:Study{
    override fun readBook() {
        println("readBook")
    }

    override fun doHomeWork() {
        println("doHomeWork")
    }

}