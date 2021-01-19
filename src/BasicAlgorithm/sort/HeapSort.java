package BasicAlgorithm.sort;

import java.util.Arrays;

/**
 * @program: algorithm
 * @description: 堆排序 注意数组长度问题和便捷
 * @author: zzh
 * @create: 2021-01-16 15:36
 **/
public class HeapSort {
    public int[] heapSort(int[] num){
        //构建大顶堆
        for (int i = num.length/2; i >= 0 ; i--) {
            //从第一个非叶子节点从下至上，从左至右的顺序调整结构
            heapAdjust(num,i,num.length-1);
        }
        //调整堆结构+交换堆顶元素和末尾元素
        for (int i = num.length-1; i >= 0; i--) {
            //交换对堆顶元素和末尾元素
            swap(num,0,i);
            //重新对堆进行调整
            heapAdjust(num,0,i-1);
        }
        return num;
    }
    //调整堆
    private void heapAdjust(int[] num, int i, int length) {
        int temp = num[i];
        for(int j=2*i;j<length;j*=2){
            //取出较大节点的下标
            if(num[j]<num[j+1])
                j++;
            //将较大的num[j]调到双亲节点上
            if (num[j] > temp){
                num[i] = num[j];
                i = j;
            }else {
                //筛选结束
                break;
            }
        }
        num[i]=temp;
    }
    private  void  swap(int[] num, int i, int length) {
        int temp = num[i];
        num[i] = num[length];
        num[length] = temp;
    }


}
