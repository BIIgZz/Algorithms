package BasicAlgorithm.sort;

import java.util.Arrays;

/**
 * @program: algorithm
 * @description: 直接插入排序
 * @author: zzh
 * @create: 2021-01-19 10:58
 **/
public class StraightInsertionSort {

    public void straightInsertionSort(int[] num){
        for (int i = 1; i < num.length; i++) {
            if (num[i]<num[i-1]){                   //如果num[i]比num[i-1]小需要向前插入
                int temp = num[i];                  //临时存储num[i]，以防止被覆盖
                for (int k = i-1 ;k>=0;k--){
                    if(temp<num[k]){                //当num[i]<num[i-1]时，将num[k]向后移动
                        num[k+1]=num[k];
                        continue;
                    }
                    num[k+1]=temp;                  //此时num[k]<num[k+1]，因此将num[i]放入num[k+1]中
                    break;
                }
            }
        }
    }


}
