package designmode.iterator;

import designmode.TreeNode;

import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 9:43
 */
public class ConcreteIterator implements Iterator<TreeNode>{

    private List<TreeNode> list;

    private int index;

    public ConcreteIterator(List<TreeNode> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index<list.size();
    }

    @Override
    public TreeNode next() {
        return list.get(index++);
    }
}
