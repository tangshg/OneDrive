package com.tangshg.onedrive.net

/**
 *author: tangshg
 *date: 2022/11/20/19:34
 *description:
 **/
class HotkeyDataTwo(val data : List<HotkeyData>,
                    val errorCode : Int,
                    val errorMsg : String){

    override fun toString(): String {
        return "(data=$data, errorCode=$errorCode, errorMsg='$errorMsg')"
    }
}