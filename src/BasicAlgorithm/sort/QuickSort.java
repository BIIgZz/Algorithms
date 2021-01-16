package BasicAlgorithm.sort;

/**
 * @program: algorithm
 * @description: 快速排序
 * @author: zzh
 * @create: 2021-01-13 20:57
 **/
public class QuickSort {
    public int[] quickSort(int[] num,int left,int right){
        if(left<right){
            int pivot = getPivot(num,left,right);
            quickSort(num,left,pivot-1);        //对左区间递归排序
            quickSort(num,pivot+1,right);        //对右区间递归排序
        }
        return num;
    }
    private int getPivot(int[] num, int left, int right) {
        int temp = num[left];                           //以num[left]为基准
        while (left<right&&num[right]>temp)             //首先从右向左扫描，找到比temp小的
            right--;
        num[left]=num[right];                           //将num[right]放入num[left]
        while (left<right&&num[left]<temp)              //从左向右扫描，找到比temp大的值
            left++;
        num[right]=num[left];                           //将num[left]放入num[right]
        num[left]=temp;
        return  left;
    }
}
