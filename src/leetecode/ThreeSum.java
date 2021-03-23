package leetecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 *
 *@description: leetecode 15. 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 *@author: zzh
 *@time: 2021/3/23 下午8:46
 * 
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> num = new ArrayList<>();
        if (nums==null||nums.length<3){
            return num;
        }
        Arrays.sort(nums);

     for(int i = 0; i < nums.length; i++) {
            if (nums[i]>0)break;
            if (i>0&&nums[i]==nums[i-1])continue;
            int low = i+1;
            int high = nums.length-1;
            while (low<high){
                int sum = nums[low]+nums[i]+nums[high];
                if (sum==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[low]);
                    temp.add(nums[i]);
                    temp.add(nums[high]);
                    num.add(temp);
                    while (low<high&&nums[low]==nums[low+1])low++;
                    while (low<high&&nums[high]==nums[high-1])high--;
                    low++;
                    high--;
                }
                else if(sum<0)low++;
                else high--;
            }
        }
     return num;
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> lists = threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }

    }
}
