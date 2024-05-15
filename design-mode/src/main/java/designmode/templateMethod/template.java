package designmode.templateMethod;

/**
 * @Author Jason.Chen
 * @create 2023/5/22 16:45
 */
public abstract class template {

    public abstract void prepare();

    public abstract void execute();

    public abstract void end();

    public void template(){
        prepare();
        execute();
        end();
    }
}
