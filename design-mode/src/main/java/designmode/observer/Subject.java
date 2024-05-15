package designmode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 14:13
 */
public abstract class Subject {

    public List<Observer> observers;

    public Subject(){
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public abstract void attach();
}
