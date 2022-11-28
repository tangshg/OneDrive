package com.tangshg.onedrive.net

/**
 *author: tangshg
 *date: 2022/11/19/19:09
 *description: 这个类用来存放 JSON数据
 * URL: https://www.wanandroid.com//hotkey/json
 **/
public class HotkeyData(
    val id: Int,
    val link: String,
    val name: String,
    val order: String,
    val visible: String
) {

    override fun toString(): String {
        return "(id=$id, link='$link', name='$name', order='$order', visible='$visible')"
    }
}
