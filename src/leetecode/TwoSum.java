package leetecode;

/**
 * @version 1.0.0
 * @ClassName TwoSum
 * @description: 167. 两数之和 II - 输入有序数组
 * @author: zzh
 * @create: 2021年08月12日 22:18:00
 **/
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 0)
            return numbers;
        int res[] = new int[2];
        int left = 0 , right = numbers.length - 1;
        while (left<right){
            if ((numbers[left]+numbers[right])<target)
                left++;
            else if ((numbers[left]+numbers[right])>target)
                right--;
            else{
                res[0] = left+1;
                res[1] = right+1;
                return res;
            }
        }
        return res;
    }
}
