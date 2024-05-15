package designmode.proxy;

/**
 * @Author Jason.Chen
 * @create 2023/6/29 18:02
 */
public class Proxy implements Subject{

    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void rentHouse() {
        System.out.println("我帮你发布到网上");
        subject.rentHouse();
        System.out.println("卖出去了");
    }
}
