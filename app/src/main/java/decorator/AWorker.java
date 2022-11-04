package decorator;

import android.annotation.SuppressLint;

/**
 * author: tangshg
 * date: 2022/11/4/21:49
 * description:
 **/
public class AWorker implements Worker{
    private Worker worker;
    public  AWorker(Worker worker){
        this.worker = worker;
    }

    @Override
    public void doSomeWork() {
        System.out.println("我们A公司，您好！");
        worker.doSomeWork();
    }
}
