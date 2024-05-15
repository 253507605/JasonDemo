package designmode.mediator;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 16:55
 */
public class ConcreteMediator extends Mediator{


    @Override
    void attachMsg(Collegue collegue) {
        list.forEach(c-> {
            if (c!=collegue){
                c.receive(collegue.getMssage());
            }
        });
    }
}
