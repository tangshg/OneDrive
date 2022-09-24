package learn

//用来学习kotlin中的lambda语法
//lambda就是可以作为参数的一段代码，最后一行会自动作为lambda表达式的返回值

fun main(){
    var list = listOf<String>("apple","huawei","mi")

    //使用经典java语法来遍历最长的字符串
    var maxPhone : String = ""
    for (phone in list){
        if (phone.length>maxPhone.length)
            maxPhone = phone
    }
    println("java maxLength is $maxPhone\n")

    //使用lambda函数来遍历最大长度
    //maxBy函数：根据我们传入的条件来遍历集合，来找出该条件下的最大值

    var maxPhone1 = ""
    var lambda1 = {string:String->string.length}
    maxPhone1 = list.maxBy(lambda1)
    println("maxPhone $maxPhone1\n")

    //精简1:可以不用定义lambda变量，直接将其传入函数
    var maxPhone2 = ""
    maxPhone2 = list.maxBy({string2:String->string2.length})
    println("max2 $maxPhone2")

    //精简2：lambda参数是函数的最后一个参数时，可以放在函数括号外面
    //精简3：lambda参数是函数的唯一参数时，可以省略函数括号
    //精简4：lambda表达式在大部分情况下可以不用声明变量类型
    //精简5：lambda表达式只有一个参数时，可以不用声明参数名,但必须使用it关键字代替

    var maxPhone3 = ""
    maxPhone3 = list.maxBy{it.length}
    println("maxPhone3 $maxPhone3")

    var maxPhone4 = list.maxBy{it.length}
    println("maxPhone4  $maxPhone4")

    println("maxPhone5  " + list.maxBy{it.length})


}
class KtLambda {

}