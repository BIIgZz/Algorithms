package leetecode;

/**
 * @program: algorithm
 * @description: 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2]
 * 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。 
 *
 * 输入：[3,4,5,1,2]
 * 输出：1
 *
 *
 * @author: zzh
 * @create: 2020-07-15 21:48
 **/
public class 旋转数组的最小数字 {
    public int minArray(int[] numbers) {
        int temp = numbers[0];
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i]<numbers[i+1])
                continue;
            temp = numbers[i+1] ;
        }
        return temp;

    }
}
