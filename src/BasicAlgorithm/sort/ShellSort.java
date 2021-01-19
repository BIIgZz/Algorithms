package BasicAlgorithm.sort;

import java.util.Arrays;

/**
 * @program: algorithm
 * @description: 希尔排序
 * @author: zzh
 * @create: 2021-01-19 12:44
 **/
public class ShellSort {
    public int[] shellSort(int[] num){
        int j ,i ,d,temp;
        //增量d，并且逐步减小增量
        for (d=num.length/2;d>0;d/=2) {
            //从第d个元素开始，逐个对其所在的组进行插入排序
            for (i = d; i < num.length; i++) {
                j = i;
                temp = num[j];
                if (num[j] < num[j - d]) {
                    while (j - d >= 0 && temp < num[j - d]) {
                        //移动法
                        num[j] = num[j - d];
                        j -= d;
                    }
                    num[j] = temp;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        ShellSort shellSort = new ShellSort();
        int num[] = {1,2,5,4};
        shellSort.shellSort(num);
        System.out.println(Arrays.toString(num));
    }
}
