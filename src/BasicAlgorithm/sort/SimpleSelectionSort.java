package BasicAlgorithm.sort;

/**
 * @program: algorithm
 * @description: 简单选择排序
 * @author: zzh
 * @create: 2021-01-16 15:19
 **/
public class SimpleSelectionSort {
    public int[] simpleSelectionSort(int[] num){
        for (int i = 0; i < num.length-1; i++) {
            int min=i;
            for (int j = i+1; j < num.length; j++) {
                if(num[j]<num[min])
                    min=j;
            }
            if(min!=i){
                int tem = num[i];
                num[i] = num[min];
                num[min] = tem;
            }
        }
        return num;
    }
}
