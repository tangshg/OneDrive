package com.tangshg.onedrive.net

import android.util.Log
import org.xml.sax.Attributes
import org.xml.sax.helpers.DefaultHandler

/**
 *author: tangshg
 *date: 2022/11/15/19:43
 *description:
 **/
class HttpHandler : DefaultHandler() {

    //记录每一个节点名
    private var nodeName = ""

    //这里是每个节点的元素

    var title: StringBuilder = StringBuilder()

    override fun startDocument() {

    }

    override fun startElement(
        uri: String,
        localName: String,
        qName: String,
        attributes: Attributes?
    ) {
        //记录当前节点名
        nodeName = localName

        //日志文件打印出当前节点名
        Log.d("HttpHandlerStart", nodeName)
    }

    override fun characters(ch: CharArray?, start: Int, length: Int) {

        //根据当前节点判断将内容添加到那一个 StringBuilder 对象中
        when (nodeName) {
            "title" -> title.append(ch, start, length)
        }
    }

    override fun endElement(uri: String?, localName: String, qName: String?) {

        if ("item" == localName) {
            Log.d("HttpHandlerEnd", localName)
            //title.setLength(0)
        }
    }

    override fun endDocument() {

    }

}