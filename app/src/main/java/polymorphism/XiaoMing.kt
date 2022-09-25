package polymorphism

//小明继承自Students类

class XiaoMing: Students() {

    override fun readBook() {
        println("小明读书")
    }

    override fun doHomeWork(){
        println("小明做作业")
    }
}