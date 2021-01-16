package utils;

/**
 * @program: algorithm
 * @description:
 * @author: zzh
 * @create: 2021-01-16 20:51
 **/
public class Swap {
    public static void  swap(int[] num, int i, int length) {
        int temp = num[i];
        num[i] = num[length];
        num[length] = temp;
    }
}
