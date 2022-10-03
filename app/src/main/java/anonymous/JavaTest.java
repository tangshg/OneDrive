package anonymous;


import java.util.function.Function;

//在java中使用 B类 中的 fun()方法
public class JavaTest {
    public void main(String[] arg) {
        B b = new B();
        Almpl almpl = new Almpl();
        //类型转换
        A a = almpl;
        b.myFun(almpl);
    }


}
