package com.tangshg.onedrive.net
import retrofit2.Call
import retrofit2.http.GET

/**
 *author: tangshg
 *date: 2022/11/19/19:22
 *description: 使用 Retrofit 的接口方法
 **/


interface HotkeyService {

    @GET ("hotkey/json")
    fun getHotkeyData() : Call<List<HotkeyData>>
}