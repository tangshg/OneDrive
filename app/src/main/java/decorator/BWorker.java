package decorator;

import anonymous.B;

/**
 * author: tangshg
 * date: 2022/11/4/21:55
 * description:
 **/
public class BWorker implements Worker{

    private Worker worker;
    public BWorker(Worker worker){
        this.worker = worker;
    }
    @Override
    public void doSomeWork() {
        System.out.println("我们是B公司的，我们进门前会戴鞋套");
        worker.doSomeWork();
    }
}
