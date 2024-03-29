package leetecode;

/**
 * @version 1.0.0
 * @ClassName Search
 * @description: 704. 二分查找
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 *
 * 示例 1:
 *
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * @author: zzh
 * @create: 2021年07月27日 23:04:00
 **/
public class Search {
    public int search(int[] nums, int target) {
        int result = -1;
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low<high){
            mid =  low + (high - low) / 2;
            if (nums[mid]<target){
                low = mid + 1;
            }else if (nums[mid]>target){
                high = mid - 1;
            }else
                return mid;
        }
        return result;
    }
}
