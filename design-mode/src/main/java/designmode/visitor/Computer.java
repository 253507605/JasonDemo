package designmode.visitor;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 16:02
 */
public class Computer {

    private Cpu cpu;

    private KeyBoard keyBoard;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }
}
