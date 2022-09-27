package anonymous;


public class JavaActivity {

    public static void main(String args[]){

        /*//1、使用最直接的方法来实现OnClickListener接口
                OnClick click = new OnClick();

        OnClickListenerImple onClickListener
                = new OnClickListenerImple();

        OnClickListener A = onClickListener;

        click.Click(A);
         */

        //2、使用匿名内部类的方法来实现点击方式
        //可以不用接口的实现类

    /*
            OnClick click = new OnClick();
        click.Click(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("匿名内部类->点击成功");
            }
        });



     */

    }
}
