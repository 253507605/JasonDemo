package algorithm.sort;

/**
 * @Author Jason.Chen
 * @create 2023/9/26 14:04
 * <p>
 * 冒泡排序
 */
public class BubbleSort {


    //正序
    public static void sort(int[] num) {
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                }
            }
        }
    }

    //倒序
    public static void reverse_sort(int[] num) {
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) {
                    int temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                }
            }
        }
    }
}
