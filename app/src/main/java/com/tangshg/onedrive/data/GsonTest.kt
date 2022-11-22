package com.tangshg.onedrive.data

import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.reflect.TypeToken

/**
 *author: tangshg
 *date: 2022/11/22/20:00
 *description: 这里用来使用 Gson 练习解析 Json
 **/

class GsonTest {

}

//使用 Gson 来解析
fun main(){
    //创建 Json 对象
    val gson = Gson()
    //双引号需要转义
    val json  = "{\"name\":\"Tom\",\"age\":20}"
    //调用 fromJson 方法，两个参数：Json 字符串、对象所属类名
    val jsonString = gson.fromJson(json,StudentData::class.java)
    println(jsonString.name)
    println(jsonString.age)

    //解析 json 数组
    val jsonTwo = "{\"data\":[{\"id\":6,\"link\":\"\",\"name\":\"面试\",\"order\":1,\"visible\":1}," +
            "{\"id\":9,\"link\":\"\",\"name\":\"Studio3\",\"order\":1,\"visible\":1}," +
            "{\"id\":5,\"link\":\"\",\"name\":\"动画\",\"order\":2,\"visible\":1}," +
            "{\"id\":1,\"link\":\"\",\"name\":\"自定义View\",\"order\":3,\"visible\":1}," +
            "{\"id\":2,\"link\":\"\",\"name\":\"性能优化 速度\",\"order\":4,\"visible\":1}," +
            "{\"id\":3,\"link\":\"\",\"name\":\"gradle\",\"order\":5,\"visible\":1}," +
            "{\"id\":4,\"link\":\"\",\"name\":\"Camera 相机\",\"order\":6,\"visible\":1}," +
            "{\"id\":7,\"link\":\"\",\"name\":\"代码混淆 安全\",\"order\":7,\"visible\":1}," +
            "{\"id\":8,\"link\":\"\",\"name\":\"逆向 加固\",\"order\":8,\"visible\":1}]," +
            "\"errorCode\":0,\"errorMsg\":\"\"}"
    //解析 Json 数组要
    val typeOf = object : TypeToken<ResponseData>() {}.type

    val jsonArray = gson.fromJson<ResponseData>(jsonTwo,typeOf)

    val data : List<Data> = jsonArray.data

    for (i in data){
        println("name is ${i.id}")
    }


}

//Json 字符串举例 {“name”:”张三” ，”age”:20 }
//首先定义一个类来做解析后的 java 对象
private class StudentData(val name : String,
                          val age : Int){
//kotlin 会自动完成 java bean 语法
}

private class ResponseData (val data : List<Data>,
                            val errorMsg : String,
                            val errorCore : Int){

}

private class Data(val id : Int,
                   val name: String,
                   val order : Int,
                   val visible : Int){

}


