package leetecode;

/**
 * @program: algorithm
 * @description: 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 *
 * 示例:
 *
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 *
 *   滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]
 *


 * @author: zzh
 * @create: 2020-06-09 21:00
 **/
public class 滑动窗口的最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length==0)
            return new int[0];
        int[] ints = new int[nums.length -k+1];
        for (int i = 0; i < nums.length-k+1; i++) {
            int j=i+k;
            int max = nums[j];
            while (--j>=0){
                if (nums[j]>max)
                    max=nums[j];
                ints[i]=max;
            }
        }
    }

}
