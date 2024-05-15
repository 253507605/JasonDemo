package designmode.memento;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 11:45
 */
public class memento {

    private Game game;

    public memento(Game game){
        this.game = game;
    }

    public Game getGame() {
        return game;
    }
}
