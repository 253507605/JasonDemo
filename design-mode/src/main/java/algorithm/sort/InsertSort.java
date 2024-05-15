package algorithm.sort;

/**
 * @Author Jason.Chen
 * @create 2023/9/26 14:05
 * 插入排序
 */
public class InsertSort {

    public static void sort(int[] num) {
        for (int i = 1; i < num.length; i++) {
            int temp = num[i];
            int j = i - 1;
            while (j >= 0 && num[j] > temp) {
                num[j+1] = num[j];
                j--;
            }
            num[++j] = temp;
        }
    }
}
