package BasicAlgorithm.sort;

import java.util.Arrays;

/**
 * @program: algorithm
 * @description: 计数排序
 * @author: zzh
 * @create: 2021-01-20 20:05
 **/
public class CountSort {
    public int[] countSort(int num[]){
        //如果数组为空直接返回
        if (num==null)
            return num;
        //找出数组num[]中的最大值和最小值
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int i : num) {
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        //初始化计数数组index。长度为最大值-最小值+1
        int length = max - min+1;
        int index[] = new int[length];
        for (int i : num) {
            //num中的元素要减去最小值成为新的索引
            index[i-min]++;
        }
        //创构建结果数组
        int[] result = new int[num.length];
        int flag = 0;
        //遍历计数数组。将计数数组的索引填充到结果数组中
        for (int i = 0; i < index.length; i++) {
            while (index[i]>0){
                //将减去的最小值加上
                result[flag++]=i+min;
                index[i]--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CountSort countSort = new CountSort();
        int num[]={5,6,1,4,2,3};
        int result[]=countSort.countSort(num);
        System.out.println(Arrays.toString(result));
    }
}
