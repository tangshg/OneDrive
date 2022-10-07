package callback

class Student : Customer() {

}
fun main(){
    val s : Customer = Customer()
    val a = 1
    val b = 2
    s.callHelp(a,b){
        a,b,result->
        println("a"+"b"+"="+"$result")
    }
}