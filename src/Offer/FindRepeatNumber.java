package Offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: Algorithms
 * @description: 剑指 Offer 03. 数组中重复的数字
 * 找出数组中重复的数字。
 *
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *
 * @author: zzh
 * @create: 2021-06-24 22:44
 **/
public class FindRepeatNumber {
    //空间换时间
    public int findRepeatNumber(int[] nums) {
       int flag[] = new int[nums.length];
        for (int num : nums) {
            flag[num]++;
            if (flag[num]>1)
                return num;
        }
        return 0;
    }
    //hashset
    public int findRepeatNumber1(int[] nums) {
        Set<Integer> hashSet = new HashSet();
        for (int num : nums) {
            if (hashSet.contains(num))
                return num;
            hashSet.add(num);
        }
        return -1;
    }
    //交换位置
    public int findRepeatNumber3(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==i)
                continue;
            if (nums[nums[i]]==nums[i])
                return nums[i];
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
        return -1;
    }
}
