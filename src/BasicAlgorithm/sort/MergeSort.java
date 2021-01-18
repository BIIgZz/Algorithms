package BasicAlgorithm.sort;

import java.util.Arrays;

/**
 * @program: algorithm
 * @description: 归并排序 多次将两个以及两个以上的有序表合并成一个新的有序表。最简单的是两个子序列合并成一个有序表叫二路归并
 * 归并排序是稳定排序，它也是一种十分高效的排序，能利用完全二叉树特性的排序一般性能都不会太差。
 * java中Arrays.sort()采用了一种名为TimSort的排序算法，就是归并排序的优化版本。
 * \每次合并操作的平均时间复杂度为O(n)，而完全二叉树的深度为|log2n|。
 * 总的平均时间复杂度为O(nlogn)。而且，归并排序的最好，最坏，平均时间复杂度均为O(nlogn)。
 * @author: zzh
 * @create: 2021-01-17 17:27
 **/
public class MergeSort {
    public int[] mergeSort(int num[]){
        sort(num,0,num.length-1);
        return num;
    }

    private int[] sort(int num[],int low,int high){
        int mid=(high+low)/2;
        if(low<high){
            //处理左边
            sort(num,low,mid);
            //处理右边
            sort(num,mid+1,high);
            //左右归并
            merge(num,low,mid,high);
        }
        return num;
    }

    private void merge(int[] num, int low, int mid, int high) {
        //辅助数组,空间复杂度为o(n)；
        int[] temp = new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        //找出较小值元素放入temp数组中
        while(i<=mid&&j<=high){
            if(num[i]<=num[j]){
                temp[k++]=num[i++];
            }else {
                temp[k++]=num[j++];
            }
        }
        //处理较长部分
        while(i<=mid)
            temp[k++]=num[i++];
        while (j<=high)
            temp[k++]=num[j++];
        //将num中的元素用temp中的元素覆盖
        for (int l = 0; l < temp.length; l++) {
            num[l+low]=temp[l];
        }

    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int num[]={1,2,5,77,4,53,2,11,20};
        mergeSort.mergeSort(num);
        System.out.println(Arrays.toString(num));
    }


}
