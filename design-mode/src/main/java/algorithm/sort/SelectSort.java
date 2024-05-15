package algorithm.sort;

/**
 * @Author Jason.Chen
 * @create 2023/9/26 14:05
 * 选择排序
 */
public class SelectSort {

    public static void sort(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[i]) {
                    int temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }
    }

    public static void reverse_sort(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] > num[i]) {
                    int temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }
    }
}
