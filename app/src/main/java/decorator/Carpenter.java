package decorator;

/**
 * author: tangshg
 * date: 2022/11/4/21:46
 * description:
 **/
public class Carpenter implements Worker{
    @Override
    public void doSomeWork(){
        System.out.println("Carpenter");
    }
}
