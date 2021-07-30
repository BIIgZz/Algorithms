package leetecode;

import java.util.Arrays;

/**
 * @version 1.0.0
 * @ClassName SortedSquares
 * @description: 977. 有序数组的平方
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]

 * @author: zzh
 * @create: 2021年07月30日 22:42:00
 **/
public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        if (nums.length == 0)
            return new int[];
        int[] array = new int[nums.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(nums[i],2);
        }
         Arrays.sort(array);
        return  array;
    }
}
