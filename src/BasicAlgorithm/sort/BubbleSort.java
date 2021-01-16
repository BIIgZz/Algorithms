package BasicAlgorithm.sort;

/**
 * @program: algorithm
 * @description: 冒泡排序
 * @author: zzh
 * @create: 2021-01-12 21:01
 **/
public class BubbleSort {
    public int[] bubbleSort(int num[]){

        for(int i = 0 ;i < num.length;i++){
            for (int j = i+1;j < num.length;j++){
                if(num[i] > num[j]){
                    int temp = num[i] ;
                    num[i] = num[j];
                    num[j] =temp;
                }
            }
        }
        return num;
    }
}
