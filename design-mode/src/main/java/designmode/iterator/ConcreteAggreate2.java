package designmode.iterator;

import designmode.TreeNode;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 10:02
 */
public class ConcreteAggreate2 extends Aggreate<TreeNode> {

    private TreeNode[] num;

    public ConcreteAggreate2() {
        num = new TreeNode[0];
    }

    @Override
    public void add(TreeNode treeNode) {
        int length = num.length + 1;
        TreeNode[] numbak = new TreeNode[length];
        System.arraycopy(num, 0, numbak, 0, num.length);
        numbak[length - 1] = treeNode;
        num = numbak;
    }


    @Override
    Iterator iterator() {
        return new ConcreteIterator2(num);
    }
}
