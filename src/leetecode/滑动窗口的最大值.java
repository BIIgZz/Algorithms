package leetecode;

import java.util.ArrayList;
import java.util.LinkedList;

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
    public static int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length==0)
            return new int[0];
        int res[] = new int[nums.length-k+1];
        int index = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i=0;i<nums.length;i++){
            //在队列不为空的情况下如果队列尾部元素比当前元素小则弹出尾部元素
            while (!queue.isEmpty()&&nums[queue.peekLast()]<=nums[i]){
                queue.removeLast();
            }
            //不走while说明队列尾部元素比当前元素大直接添加
            queue.addLast(i);
            //如果滑动窗口路过队头元素，则删除队头元素
            if (queue.peekFirst()==i-k){
                queue.removeFirst();
            }
            if (i>=k-1){
                res[index++] = nums[queue.peekFirst()];
            }
        }
        return res;


    }

}
