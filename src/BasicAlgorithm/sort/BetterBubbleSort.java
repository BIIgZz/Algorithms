package BasicAlgorithm.sort;

/**
 * @program: algorithm
 * @description: 冒泡排序简单优化
 * @author: zzh
 * @create: 2021-01-13 19:55
 **/
public class BetterBubbleSort {
    public  int[] betterBubbleSort(int num[]){
        for (int i = 0; i < num.length; i++) {
            boolean flag = false;
            for (int j = i+1; j < num.length; j++) {
                if(num[i] > num[j]){
                    int temp = num[i] ;
                    num[i] = num[j];
                    num[j] =temp;
                    flag = true;
                }
            }
            if (!flag)
                return num;
        }
        return num;
    }

}
