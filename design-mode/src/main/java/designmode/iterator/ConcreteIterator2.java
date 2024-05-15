package designmode.iterator;

import designmode.TreeNode;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 9:43
 */
public class ConcreteIterator2 implements Iterator<TreeNode>{

    private TreeNode[] num;

    private int index;

    public ConcreteIterator2(TreeNode[] num){
        this.num = num;
    }

    @Override
    public boolean hasNext() {
        return index<num.length;
    }

    @Override
    public TreeNode next() {
        return num[index++];
    }
}
