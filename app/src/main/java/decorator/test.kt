package decorator

/**
 *author: tangshg
 *date: 2022/11/4/22:00
 *description:
 * 用来测试装饰者模式
 * A公司、B公司就是装饰者
 * 水管工、木匠是被装饰者
 * 被装饰者水管工、木匠用来实现真正的功能的工作
 * 装饰者用来被装饰者的工作之外
 **/

fun main (){
    //生成水管工和木匠
    val p = Plumber()
    val c = Carpenter()
    //满足客户的要求
    println("我是客户，我要A公司的水管工和B公司的木匠")
    AWorker(p).doSomeWork()
    BWorker(c).doSomeWork()
    println("我是客户，我要B公司的水管工和B公司的木匠")
    BWorker(p).doSomeWork()
    BWorker(c).doSomeWork()
}