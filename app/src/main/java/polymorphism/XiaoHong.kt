package polymorphism

class XiaoHong: Students() {
    override fun readBook() {
        println("小红读书")
    }

    override fun doHomeWork(){
        println("小红做作业")
    }
}