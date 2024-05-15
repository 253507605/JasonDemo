package designmode.mediator;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 16:56
 */
public abstract class Collegue {

    public Mediator mediator;

    private String mssage;

    public String getMssage() {
        return mssage;
    }

    public void setMssage(String mssage) {
        this.mssage = mssage;
    }

    public Collegue(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void sayMsg(String message);

    public abstract void receive(String message);
}
