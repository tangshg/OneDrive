package ktFun

import java.io.*
import java.lang.Byte
import java.nio.Buffer
import java.nio.CharBuffer

class IOStream {

}
fun main (){


    //通过 File 类创建一个文件对象实例
    val f = File("D:/Android/AndroidProject/DB.txt")
    //通过这个流，就可以把文件读到 java 虚拟机中，即内存中
    val fis = FileInputStream(f)
    //制作容器，存放通过流读取到的字符文件
    //这里是一个字符实例，通过 ByteArray 制作
    val length = f.length().toInt()
    val buffer = ByteArray(length)
    //这里可以将字节转换成字符
    val buffers = String(buffer)
    //调用 FileInputStream 中的 read 方法来读取文件
    fis.read(buffer,0,length)
    //kotlin 中的循环结构
    //如果使用 0..length 会报错：index 16 out of bounds for length 16
    for(i in 0 until length){
        //这里打印出来的是字符对应的
        println(buffers[i])
    }
    //每次使用过后，应该关闭文件流
    fis.close()

    //练习字符流的操作
    //获取文件实例
    val f1 = File("d:/Android/AndroidProject/DB.txt")
    //获取文件字符的长度
    val length1 = f.length().toInt()
    //开启字符流
    val fis1 = FileReader(f)
    //使用 BufferedReader 方法来读取数据
    val buffer1 = BufferedReader(fis1)
    //定义 String 实例，用来存放读取到的数据
    //BufferedReader.readLine 方法，每次读取一行数据
    val s1:String = buffer1.readLine()
    println(s1)






}