package designmode.mediator;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 16:56
 */
public class ConcreteCollegue2 extends Collegue{

    public ConcreteCollegue2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sayMsg(String message) {
        System.out.println(message);
        this.setMssage(message);
        mediator.attachMsg(this);
    }

    @Override
    public void receive(String message) {
        System.out.println("收到消息:"+message);
    }
}
