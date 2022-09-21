package learn

//这里主要学习kotlin中的继承->主构造函数和此构造函数
//子类中的构造函数必须调用父类的构造函数

class Student(val sno:String,val grade:Int ):Person() {
    init {
        println("sno is $sno")
        println("grade is $grade")
    }
}