package com.tangshg.onedrive.net

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tangshg.onedrive.databinding.ActivityNetworkBinding
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import kotlin.concurrent.thread

class NetworkActivity : AppCompatActivity() {

        private lateinit var binding: ActivityNetworkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNetworkBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonHttp.setOnClickListener{
            sendRequestWithHttpURLConnection()
        }

    }

    //region 这里使用 HTTP 进行网络连接
    private fun sendRequestWithHttpURLConnection(){

        thread {
            //1.获取 URL 对象
            val url = URL("http://api.ithome.com/xml/newslist/news.xml")
            //打开链接
            val connection = url.openConnection() as HttpURLConnection
            //设置 HTTP 请求使用的方法
            connection.requestMethod = "GET"
            //自用定制，如连接超时、读取超时的毫秒数，以及希望得到的消息头
            connection.connectTimeout = 8000
            //获取服务器返回的输入流
            val input = connection.inputStream

            //下面对获取的输入流进行处理
            val response = StringBuilder()
            //将服务器返回的输入流放入处理流中
            //服务返回的是一个字节流，但是我们要处理的字符流，这里就需要将字节流转成字符流，
            // 使用 InputStreamReader 方法
            //BufferedReader 这里字符处理流最大的用处是其中的 read.line()方法，可以一次读取一行数据
            val reader = BufferedReader(InputStreamReader(input))
            //读取输入流中的字符文件
            reader.use{
                while(true){
                    val line = reader.readLine() ?: break
                    response.append(line)
                    showResponse(response)

                }
            }
            //将 HTTP 连接关闭
            connection.disconnect()
        }}

    private fun showResponse(response: StringBuilder){
        runOnUiThread{
            binding.netFrag.text = response
        }
    }
    //endregion

}