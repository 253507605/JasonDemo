package designmode.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 16:55
 */
public abstract class Mediator {

    public List<Collegue> list;

    public Mediator(){
        this.list = new ArrayList<>();
    }

    public void add(Collegue collegue){
        list.add(collegue);
    }

    abstract void attachMsg(Collegue collegue);
}
