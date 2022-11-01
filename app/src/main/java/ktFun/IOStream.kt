package ktFun

import java.io.File
import java.io.FileInputStream
import java.io.IOException
import java.lang.Byte

class IOStream {

}
fun main (){
    val f = File("D:/OneDrive/阅读/books/情色小说/合集一.txt")
    //通过这个流，就可以把文件读到 java 虚拟机中，即内存中
    val fis = FileInputStream("f")

    fis.read()
}