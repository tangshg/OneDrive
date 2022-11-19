package com.tangshg.onedrive.net

import java.net.CacheResponse

/**
 *author: tangshg
 *date: 2022/11/19/21:11
 *description: OkHttp 网络回调
 **/

interface OkHttpCallbackListener {

    fun onFinish(response: String)
}