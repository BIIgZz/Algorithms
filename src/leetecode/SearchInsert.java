package leetecode;
/**
 *
 *
 *@description: leetecode 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 *@author: zzh
 *@time: 2021/3/20 下午3:18
 * 
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
         if (nums.length==0) return 0;
            int mid=0 ;
            int low = 0,high = nums.length -1;

            if (target<nums[low]) return 0;
          if (target>nums[high]) return high+1;
            while (low<high){
                mid = ( high + low) / 2;
                if (nums[mid] < target) low = mid + 1;
                else high = mid ;
            }
            return low;
    }

    public static void main(String[] args) {
        SearchInsert search= new SearchInsert();
        int[] nums = {1,3};
        int target = 2;
        int i = search.searchInsert(nums, target);
        System.out.println(i);
    }
}
