package leetecode;

import java.util.Arrays;

/**
 * @program: algorithm
 * @description: 输入整数数组 arr ，找出其中最小的 k 个数。
 *
 * 例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 * 示例 1：
 *
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * 示例 2：
 *
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 *
 *
 *
 * @author: zzh
 * @create: 2020-06-12 22:15
 **/
public class 最小的k个数 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length==0)
            return new int[0];
        sort(arr,0,arr.length-1);
        int res[] = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    private void sort(int[] arr, int low, int high) {
        if (low<high){
            int p = partition(arr,low,high);
            sort(arr,low,p-1);
            sort(arr,p+1,high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int p = arr[low];
        while (low<high){
            while (low<high&&arr[high]>=p)--high;
            arr[low]=arr[high];
            while (low<high&&arr[low]<=p)++low;
            arr[high]=arr[low];
        }
        arr[low]=p;
        return low;
    }

    public static void main(String[] args) {
        最小的k个数 a = new 最小的k个数();
        int[] leastNumbers = a.getLeastNumbers(new int[]{4,3, 2, 1,}, 4);
        for (int i = 0; i < leastNumbers.length; i++) {
            System.out.println(leastNumbers[i]);
        }
    }
}
