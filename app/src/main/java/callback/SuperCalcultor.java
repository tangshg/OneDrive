package callback;

public class SuperCalcultor {
    //这里为什么要加入 dojob  参数？因为超级计算器要知道自己在计算后，还要做什么
    public void add (int a, int b, doJob dojob){
        int result = a+b;
        dojob.fillBlank(a,b,result);
    }
}
