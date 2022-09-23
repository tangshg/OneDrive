package learn

//这里主要学习kotlin中的继承->主构造函数和此构造函数
//子类中的构造函数必须调用父类的构造函数

fun main(){
    var student = Student("tang",22)

    doStudy(student)
}

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


