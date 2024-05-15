package designmode.visitor;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 16:06
 */
public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu(new Cpu());
        computer.setKeyBoard(new KeyBoard());
        computer.getCpu().accept(new ConcreteVisitor());
        computer.getKeyBoard().accept(new ConcreteVisitor());
    }
}
