package designmode.observer;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 14:22
 */
public class Test {

    public static void main(String[] args) {
        ConcreteSubject1 subject1 = new ConcreteSubject1();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        subject1.addObserver(observer1);
        subject1.addObserver(observer2);
        subject1.setName("123");
        subject1.attach();

        ConcreteSubject2 subject2 = new ConcreteSubject2();
        Observer observer3 = new ConcreteObserver3();
        Observer observer4 = new ConcreteObserver4();
        subject2.addObserver(observer3);
        subject2.addObserver(observer4);
        subject2.setName("456");
        subject2.attach();
    }
}
