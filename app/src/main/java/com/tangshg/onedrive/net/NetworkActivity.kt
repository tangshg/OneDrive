package com.tangshg.onedrive.net

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.tangshg.onedrive.databinding.ActivityNetworkBinding
import org.xml.sax.InputSource
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.StringReader
import java.net.HttpURLConnection
import java.net.URL
import java.util.Collections.list
import javax.xml.parsers.SAXParserFactory
import kotlin.concurrent.thread

class NetworkActivity : AppCompatActivity() {

        private lateinit var binding: ActivityNetworkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNetworkBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonHttp.setOnClickListener {
            //sendRequestWithHttpURLConnection()
            //使用 Http 的网络回调接口
            HttpUtil.sendHttpRequest(
                "http://192.168.10.110:8085/test",
                object : HttpCallbackListener {
                    //这里使用的 lambda 的写法，最后参数时 lambda 表达式时
                    override fun onFinish(response: String) {
                        showResponse(response)
                    }

                    override fun onError(e: Exception) {
                        TODO("Not yet implemented")
                    }

                })
        }
        binding.buttonOkhttp.setOnClickListener {
            OkHttpUtil.sendOkHttpRequest("http://api.ithome.com/xml/newslist/news.xml",
                object : OkHttpCallbackListener {
                    override fun onFinish(response: String) {
                        showResponse(response)
                    }
                })
        }


        binding.buttonRetrofit.setOnClickListener {

            Log.d("NetWorkActivity","button")

            val retrofit = Retrofit.Builder()
                .baseUrl("https://www.wanandroid.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            //创建一个接口的动态代理对象，有了这个动态代理对象，我们可以随意调用接口中方法
            val hotkeyService = retrofit.create(HotkeyService::class.java)

            hotkeyService.getHotkeyData()
                         .enqueue(object : Callback<HotkeyDataTwo>{
                             override fun onResponse(
                                 call: Call<HotkeyDataTwo>,
                                 response: Response<HotkeyDataTwo>
                             ) {
                                 val hotkeyData = response.body()
                                 Log.d("NetWorkActivity",hotkeyData.toString())
                                 showResponse(hotkeyData)
                             }

                             /**
                              * Invoked when a network exception occurred talking to the server or when an unexpected
                              * exception occurred creating the request or processing the response.
                              */
                             override fun onFailure(call: Call<HotkeyDataTwo>, t: Throwable) {
                                 TODO("Not yet implemented")
                             }


                         })


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

                    //showResponse(response)
                }
            }
            val s : String = response.toString()
            parseXMLWithXML(s)

            val parserResult = HttpHandler()
            //val parserResultString : StringBuilder = parserResult.title

            //showResponse()
            connection.disconnect()
        }}

    private fun showResponse(response: HotkeyDataTwo?){
        runOnUiThread{
            binding.netFrag.text = response ?. data.toString()
        }
    }

    private fun showResponse(response: String){
        runOnUiThread{
            binding.netFrag.text = response
        }
    }

    private fun showResponse(response: StringBuilder){
        runOnUiThread{
            binding.netFrag.text = response
        }
    }
    //endregion


    //region 使用 SAX 解析XML文档
    private fun parseXMLWithXML(xmlData: String){

        val factory = SAXParserFactory.newInstance()
        val xmlReader = factory.newSAXParser().xmlReader
        val handler = HttpHandler()
        xmlReader.contentHandler = handler
        //开始执行解析
        xmlReader.parse(InputSource(StringReader(xmlData)))

    }
    //endregion

}