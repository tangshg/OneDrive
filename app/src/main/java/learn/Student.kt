package learn

//这里主要学习kotlin中的继承->主构造函数和此构造函数
//子类中的构造函数必须调用父类的构造函数

fun main(){
    var student = Student("girl",100)

    student.name = "tang"
    student.age = 22
    doStudy(student)

    //普通对接口的实现
    student.doHomeWork()
    student.readBook()

}

//面向接口编程，多态
fun doStudy(student : Study){
    student.doHomeWork()
    student.readBook()
}

class Student(val sno:String, val grade:Int ):Person(),Study{
    //初始化类 Student 构造函数
    init {
        println("sno is $sno")
        println("grade is $grade")
    }

    override fun readBook(){
        println("$name is reading")
    }

    override fun doHomeWork(){
        println("$name do HomeWork")
    }
}


