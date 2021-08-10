package leetecode;

/**
 * @version 1.0.0
 * @ClassName NextPermutation
 * @description: 31. 下一个排列
 * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列（即，组合出下一个更大的整数）。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须 原地 修改，只允许使用额外常数空间。
 *
 * @author: zzh
 * @create: 2021年08月10日 21:06:00
 **/
public class NextPermutation {
        public void nextPermutation(int[] nums) {
            if (nums == null || nums.length == 0) return;
            int firstIndex = -1;
            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] < nums[i + 1]) {
                    firstIndex = i;
                    break;
                }
            }
            if (firstIndex == -1) {
                reverse(nums, 0, nums.length - 1);
                return;
            }
            int secondIndex = -1;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[firstIndex]) {
                    secondIndex = i;
                    break;
                }
            }
            swap(nums, firstIndex, secondIndex);
            reverse(nums, firstIndex + 1, nums.length - 1);
            return;

        }

        private void reverse(int[] nums, int i, int j) {
            while (i < j) {
                swap(nums, i++, j--);
            }
        }

        private void swap(int[] nums, int i, int i1) {
            int tmp = nums[i];
            nums[i] = nums[i1];
            nums[i1] = tmp;
        }

}
