package BasicAlgorithm.sort;

import java.util.Arrays;

/**
 * @program: algorithm
 * @description:    折半插入排序
 * @author: zzh
 * @create: 2021-01-19 11:22
 **/
public class BinInsertSort {
    public int[] binInsertSort(int num[]){
        int low,high,temp,mid,i;
        for ( i = 1; i < num.length; i++) {
            //反序时
            if (num[i]<num[i-1]) {
                low = 0;
                high = i - 1;
                temp = num[i];
                //在num[low....high]中寻找插入位置
                while (low <= high) {
                    //取中间节点位置
                    mid = (low + high) / 2;
                    //插入点在右边
                    if (num[mid] < temp) {
                        low = mid + 1;
                    } else {
                        //插入点在左边
                        high = mid - 1;
                    }
                }
                //集中进行元素后移
                for (int j = i-1; j> high; j--) {
                    num[j+1]=num[j];
                }
                //将temp插入
                num[high+1] = temp;
            }

            }

        return num;
    }


}
