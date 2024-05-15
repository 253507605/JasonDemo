package designmode;

/**
 * @Author Jason.Chen
 * @create 2023/9/4 13:21
 */
public class TreeNode {

    private volatile int value;

    private TreeNode next;

    public TreeNode(){}
    public TreeNode(int value){
        this.value = value;
    }

    public synchronized int getValue() throws InterruptedException {
        Thread.sleep(20000);
        return value;
    }

    public synchronized void setValue(int value) throws InterruptedException {
        Thread.sleep(20000);
        this.value = value;
    }

    public TreeNode getNext() {
        return next;
    }

    public void setNext(TreeNode next) {
        this.next = next;
    }

    public static void main(String[] args){
        TreeNode treeNode = new TreeNode();
        new Thread(()->{
            try {
                treeNode.setValue(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                int value = treeNode.getValue();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
