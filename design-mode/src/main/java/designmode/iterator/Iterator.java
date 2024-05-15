package designmode.iterator;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 9:42
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}
