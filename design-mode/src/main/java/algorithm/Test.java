package algorithm;

import algorithm.sort.InsertSort;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author Jason.Chen
 * @create 2023/9/26 13:51
 */
public class Test {

    private static int count = 100;

    public static void main(String[] args) {
        int[] nums = {8,10,4,4,1,7,3,9,0};
        InsertSort.sort(nums);
        for(int i=0;i< nums.length;i++){
            System.out.println(nums[i]);
        }

        ExecutorService executors = Executors.newCachedThreadPool();
//        executors.execute(()->{});
//
//        ReentrantLock lock = new ReentrantLock();
//        //带入一个银行办理业务的案例来模拟我们的AQS如何进行线程的管理和通知唤醒机制
//        //3个线程模拟3个来银行网点,受理窗口办理业务的顾客
//        //A顾客就是第一个顾客,此时受理窗口没有任何人,A可以直接去办理
//        new Thread(() -> {
//            lock.lock();
//            try{
//                System.out.println("-----A thread come in");
//
//                try { TimeUnit.MINUTES.sleep(1); }catch (Exception e) {e.printStackTrace();}
//            }finally {
//                lock.unlock();
//            }
//        },"A").start();
//
//        //第二个顾客,第二个线程---》由于受理业务的窗口只有一个(只能一个线程持有锁),此时B只能等待,
//        //进入候客区
//        new Thread(() -> {
//            lock.lock();
//            try{
//                System.out.println("-----B thread come in");
//            }finally {
//                lock.unlock();
//            }
//        },"B").start();
//
//        //第三个顾客,第三个线程---》由于受理业务的窗口只有一个(只能一个线程持有锁),此时C只能等待,
//        //进入候客区
//        new Thread(() -> {
//            lock.lock();
//            try{
//                System.out.println("-----C thread come in");
//            }finally {
//                lock.unlock();
//            }
//        },"C").start();
    }


    public static int countSeniors(String[] details) {

        int count=0;
        try {
//            int i = 2/0;
            return count;
        } catch (Exception e){

        }finally {
            return 12;
        }
//        return -1;
    }
}
