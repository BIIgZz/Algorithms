package leetecode;

/**
 * @version 1.0.0
 * @ClassName MoveZeroes
 * @description: 283. 移动零
 * @author: zzh
 * @create: 2021年08月12日 21:06:00
 **/
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        int j = 0;
       for (int i=0;i < nums.length;i++){
           if (nums[i]!=0){
               temp = nums[i];
               nums[i] = nums[j];
               nums[j++] = temp;
           }
       }
    }
}
