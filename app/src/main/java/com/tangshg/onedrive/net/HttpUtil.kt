package com.tangshg.onedrive.net

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import kotlin.concurrent.thread

/**
 *author: tangshg
 *date: 2022/11/18/21:11
 *description: 网络回调
 **/
object HttpUtil {
    //定义一个网络回调方法，参数有两个：网络地址、回调接口
    fun sendHttpRequest(address: String, listener: HttpCallbackListener) {
        //开启一个线程用来请求网络
        thread {
            val url = URL(address)
            val connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = "GET"
            connection.connectTimeout = 8000
            val response = StringBuilder()

            //获取服务器的返回流
            val input = connection.inputStream
            //读取数据流中的数据
            val reader = BufferedReader(InputStreamReader(input))
            reader.use {
                while (true) {
                    var line = reader.readLine() ?: break
                    response.append(line)
                }
            }
            //因为子线程中无法通过 return 返回数据，所以这里使用回调方法
            //回调 onFinish() 方法
            listener.onFinish(response.toString())
        }
    }
}