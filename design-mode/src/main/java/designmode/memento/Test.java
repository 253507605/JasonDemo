package designmode.memento;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 13:25
 */
public class Test {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Game game1 = new Game("第一次存储");
        caretaker.saveMemento(game1);
        Game game2 = new Game("第二次存储");
        caretaker.saveMemento(game2);
        Game game3 = new Game("第三次存储");
        caretaker.saveMemento(game3);
        Game game4 = new Game("第四次存储");
        caretaker.saveMemento(game4);
        System.out.println(caretaker.getMemento().getGame().getState());
        System.out.println(caretaker.getMemento(0).getGame().getState());
    }
}
