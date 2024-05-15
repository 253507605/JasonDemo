package designmode.iterator;

import designmode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 10:02
 */
public class ConcreteAggreate1 extends Aggreate<TreeNode>{

    private List<TreeNode> list;

    public ConcreteAggreate1(){
        list = new ArrayList<>();
    }

    @Override
    public void add(TreeNode treeNode){
        list.add(treeNode);
    }


    @Override
    Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
