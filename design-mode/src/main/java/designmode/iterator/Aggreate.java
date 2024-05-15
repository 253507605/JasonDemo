package designmode.iterator;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 10:00
 */
public abstract class Aggreate<T> {

    abstract Iterator iterator();

    public abstract void add(T t);
}
