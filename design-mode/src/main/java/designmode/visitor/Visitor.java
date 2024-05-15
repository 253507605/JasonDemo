package designmode.visitor;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 16:02
 */
public interface Visitor {

    public void visit(Cpu cpu);
    public void visit(KeyBoard keyBoard);
}
