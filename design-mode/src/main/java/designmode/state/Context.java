package designmode.state;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 18:12
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Context() {
        this.state = new NewState();
    }

    public void start(){
        state.start(this);
    }

    public void wait1(){
        state.wait(this);
    }

    public void sleep1(){
        state.sleep(this);
    }

    public void notify1(){
        state.notify(this);
    }

    public void shutdown(){
        state.shutdown(this);
    }
}

