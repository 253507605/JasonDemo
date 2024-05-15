package designmode.observer;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 14:16
 */
public class ConcreteObserver1 implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("ConcreteObserver1观察"+subject);
    }
}
