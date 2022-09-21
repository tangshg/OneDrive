package learn

open class Person{
    var name :String = ""
    var age = 0
    fun eat(name:String,age:Int){
        print(name+ "is eating.He is " + age + " years old")
    }
}

fun main(){
    var p = Person()
    p.eat("tang ",12 )
}



