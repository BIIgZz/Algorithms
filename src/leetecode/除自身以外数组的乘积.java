package leetecode;

import java.util.Scanner;

/**
 * @program: algorithm
 * @description:
 * 给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，
 * 其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 * @author: zzh
 * @create: 2020-06-04 21:23
 **/
public class 除自身以外数组的乘积 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int[] l =new int[n];//前缀之积
        int[] r = new int[n];//后缀之积
        l[0]=1;
        r[n-1]=1;
        for (int i = n-2; i >= 0; i--) {
            r[i] = num[i+1]*r[i+1];
        }
        for (int i = 1; i < n; i++) {
            l[i] = num[i-1]*l[i-1];
        }
        for (int i = 0; i < n; i++) {
            result[i] = l[i]*r[i];
            System.out.println(result[i]);
        }

    }
}
