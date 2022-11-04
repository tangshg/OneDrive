package decorator;

/**
 * author: tangshg
 * date: 2022/11/4/21:44
 * description: 水管工的类
 **/
public class Plumber implements Worker{
    @Override
    public void doSomeWork() {
        System.out.println("Plumber");
    }
}
