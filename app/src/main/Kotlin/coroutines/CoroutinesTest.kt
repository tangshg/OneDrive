package coroutines

import kotlinx.coroutines.*

/**
 *author: tangshg
 *date: 2022/11/25/21:19
 *description: 练习 kotlin 中的协程
 **/

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    GlobalScope.launch {
        println("codes run in GlobalScope coroutine scope")

        // delay 只会阻塞当前协成
        delay(1500)
        println("codes run in GlobalScope coroutine scope finish")
    }

    // 主线程中的代码会立即执行
    println("main code")

    // runBlocking 会在作用域里的代码执行完之前一直阻塞当前线程
    runBlocking {

        // 这里延迟 2 秒来保证 JVM 存活
        // delay(2000)

        // 使用 launch 来创建子协程
        launch {
            println("launch1")
            delay(1000)
            println("launch1 finish")
        }
        launch {
            println("launch2")
            delay(1000)
            println("launch2 finish")
        }
    }

    Thread.sleep(1000)
}