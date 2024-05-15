package designmode.iterator;

import designmode.TreeNode;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 10:31
 */
public class Test {

    public static void main(String[] args) {
        Aggreate aggreate = new ConcreteAggreate1();
        aggreate.add(new TreeNode(1));
        aggreate.add(new TreeNode(2));
        aggreate.add(new TreeNode(3));
        aggreate.add(new TreeNode(4));
        Iterator<TreeNode> iterator = aggreate.iterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next().getValue());
        }

        Aggreate aggreate1 = new ConcreteAggreate2();
        aggreate1.add(new TreeNode(5));
        aggreate1.add(new TreeNode(6));
        aggreate1.add(new TreeNode(7));
        aggreate1.add(new TreeNode(8));
        Iterator<TreeNode> iterator1 = aggreate1.iterator();

    }
}
