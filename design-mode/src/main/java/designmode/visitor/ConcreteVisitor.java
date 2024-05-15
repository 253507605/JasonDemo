package designmode.visitor;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 16:07
 */
public class ConcreteVisitor implements Visitor{

    @Override
    public void visit(Cpu cpu) {
        System.out.println("买了一个CPU，花费好多钱");
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("买了一个键盘，花费好多钱");
    }
}
