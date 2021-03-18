package leetecode;

/**
 *
 *
 *@description: leetecode 88. 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 *
 *
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 *@author: zzh
 *@time: 2021/3/18 下午9:29
 * 
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            int t1 = m-1;
            int t2 = n-1;
            int p = m+n-1;
            while(t2>=0){
                if (t1>=0){
                    nums1[p--]=(nums1[t1]>nums2[t2])?nums1[t1--]:nums2[t2--];
                }e{
                    nums1[p--]=nums2[t2--];
                }

            }
            while (t1>0)nums1[p--]=nums1[t1--];
            while (t2>0)nums1[p--] = nums2[t2--];
    }
    
}
