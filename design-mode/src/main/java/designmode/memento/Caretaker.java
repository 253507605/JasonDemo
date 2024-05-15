package designmode.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 11:47
 */
public class Caretaker {

    private List<memento> list;

    public Caretaker(){
        list = new ArrayList<>();
    }

    public void saveMemento(Game game){
        list.add(new memento(game));
    }

    public memento getMemento(){
        return list.size()>0 ? list.get(list.size()-1) : null;
    }

    public memento getMemento(int index){
        return list.get(index);
    }

    public void removeMemento(int index){
        list.remove(index);
    }
}
