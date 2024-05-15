package designmode.mediator;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 16:59
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Collegue collegue = new ConcreteCollegue1(mediator);
        Collegue collegue1 = new ConcreteCollegue2(mediator);
        mediator.add(collegue);
        mediator.add(collegue1);
        collegue.sayMsg("大家好，我是新人");
        collegue1.sayMsg("新人爆个照吧");
    }
}
