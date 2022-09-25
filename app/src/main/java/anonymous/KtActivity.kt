package anonymous

//通过模拟点击事件来学习内部匿名类
//kotlin调用Java方法时可以使用函数式API

class KtActivity {
//1、使用最直接的方法来实现OnClickListener接口，在JavaActivity实现
//Kotlin使用函数式API来实现点击事件

}
fun main() {
    val click: OnClick = OnClick()

    click.Click({
        object : OnClickListener {
            override fun onClick() {
                println("Kotlin中的内部匿名类实现")
            }
        }
    })

    click.Click {
        println("Kotlin中的lambda实现")
    }
}