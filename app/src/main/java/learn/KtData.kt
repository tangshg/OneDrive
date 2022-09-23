package learn

//使用kotlin创建一个数据类
//当一个类没有任何代码时，可以不用加{}

//测试创建的KtData
fun main(){
    val phone1= KtData("mi",999.9)
    val phone2=KtData("apple",9999.9)

    println("data trust" + (phone1==phone2))
}

data class KtData(var brand:String,var price:Double)
