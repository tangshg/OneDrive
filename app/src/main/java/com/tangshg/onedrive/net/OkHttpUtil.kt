package com.tangshg.onedrive.net

import okhttp3.OkHttpClient
import okhttp3.Request
import kotlin.concurrent.thread

/**
 *author: tangshg
 *date: 2022/11/19/21:11
 *description: OkHttp 网络回调
 **/

object OkHttpUtil {

     fun sendOkHttpRequest(url:String,listener: OkHttpCallbackListener){

        thread {
            val client = OkHttpClient()

            val request = Request.Builder()
                .url(url)
                .build()

            val response =  client.newCall(request).execute()
            val responseData = response.body?.string()

            if (responseData !=null ){
                listener.onFinish(responseData)
            }

        }

    }


}