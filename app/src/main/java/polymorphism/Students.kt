package polymorphism

import learn.Study
import learn.doStudy

fun main(){

    //小明和小红都是学生类的继承者，都调用readBook方法，结果却不一样，这就是多态
    //1、父类引用指向子类 2、子类重写方法
    val xiaoming:Students = XiaoMing()
    val xiaohong:Students = XiaoHong()

    xiaoming.readBook()
    xiaohong.readBook()

    //利用接口来实现多态
    //类的转型
    val xiaoming1 : Students = XiaoMing()
    doStudy(xiaoming1)

    val xiaohong1 = XiaoHong()
    doStudy(xiaohong1)


}

//接口Study的实现类

open class Students:Study{
    override fun readBook() {
        println("readBook")
    }

    override fun doHomeWork() {
        println("doHomeWork")
    }

    //这里接受一个Study接口类型的参数，因为Students是study的实现类，所以可以传入
    fun doStudy(study:Study){
        study.readBook()
        study.doHomeWork()
    }

}