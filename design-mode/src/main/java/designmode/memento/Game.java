package designmode.memento;

import java.util.Date;
import java.util.UUID;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 11:46
 */
public class Game {

    private String id;

    private String state;

    private Date date;

    public Game(String state){
        this.id = UUID.randomUUID().toString();
        this.state = state;
        this.date = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
