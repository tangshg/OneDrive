package com.tangshg.onedrive.net

/**
 *author: tangshg
 *date: 2022/11/18/21:04
 *description:网络回调
 **/
interface HttpCallbackListener {
    fun onFinish(response: String)
    fun onError(e: Exception)
}