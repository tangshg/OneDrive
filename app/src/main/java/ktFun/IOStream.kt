package ktFun

import java.io.File
import java.io.FileInputStream
import java.io.FileReader
import java.io.IOException
import java.lang.Byte
import java.nio.Buffer

class IOStream {

}
fun main (){

    /*  字符流读写的操作
    //通过 File 类创建一个文件对象实例
    val f = File("D:/Android/AndroidProject/DB.txt")
    //通过这个流，就可以把文件读到 java 虚拟机中，即内存中
    val fis = FileInputStream(f)
    //制作容器，存放通过流读取到的字符文件
    //这里是一个字符实例，通过 ByteArray 制作
    val length = f.length().toInt()
    val buffer = ByteArray(length)
    //调用 FileInputStream 中的 read 方法来读取文件
    fis.read(buffer,0,length)
    //kotlin 中的循环结构
    //如果使用 0..length 会报错：index 16 out of bounds for length 16
    for(i in 0 until length){
        //这里打印出来的是字符对应的
        println(buffer[i])
    }
    //每次使用过后，应该关闭文件流
    fis.close()
     */

    //练习字符流的操作
    //获取文件实例
    val f = File("d:/Android/AndroidProject/DB.txt")
    //获取文件字符的长度
    val length = f.length().toInt()
    //开启字符流
    val fis = FileReader(f)
    //定义存放字符的数组




}