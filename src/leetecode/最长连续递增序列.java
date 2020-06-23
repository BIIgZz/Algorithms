package leetecode;

/**
 * @program: algorithm
 * @description: 给定一个未经排序的整数数组，找到最长且连续的的递增序列，并返回该序列的长度。
 *
 *
 * 示例 1:
 *
 * 输入: [1,3,5,4,7]
 * 输出: 3
 * 解释: 最长连续递增序列是 [1,3,5], 长度为3。
 * 尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为5和7在原数组里被4隔开。
 * 示例 2:
 *
 * 输入: [2,2,2,2,2]
 * 输出: 1
 * 解释: 最长连续递增序列是 [2], 长度为1。
 *
 * @author: zzh
 * @create: 2020-06-13 20:27
 **/
public class 最长连续递增序列 {

    public int findLengthOfLCIS(int[] nums) {
        if(nums.length<=0)
            return 0;
        int count=1;
        int temp=nums[0];
        int max = count;
        for (int i = 0; i < nums.length; i++) {
            if (temp<nums[i]){
                count++;
            }else{
                count = 1;
            }
            if (max<count){
                max = count;
            }
            temp = nums[i];
        }
        return max;
    }

    public int findLengthOfLCISBest(int[] nums) {
        int ans = 0, anchor = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > 0 && nums[i-1] >= nums[i]) anchor = i;
            ans = Math.max(ans, i - anchor + 1);
        }
        return ans;
    }


}
