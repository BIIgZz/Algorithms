package leetecode;

/**
 * @version 1.0.0
 * @ClassName ReverseString
 * @description: 344. 反转字符串
 * @author: zzh
 * @create: 2021年08月13日 20:29:00
 **/
public class ReverseString {
    public void reverseString(char[] s) {
        reverse(0,s.length-1,s);
    }

    private void reverse(int left, int right, char[] s) {
        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
