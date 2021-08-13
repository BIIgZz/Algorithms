package leetecode;

/**
 * @version 1.0.0
 * @ClassName ReverseWords
 * @description: 557. 反转字符串中的单词 III
 * @author: zzh
 * @create: 2021年08月13日 21:07:00
 **/
public class ReverseWords {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==' '){
               reverse(start,i-1,chars);
                start = i + 1;
                continue;
            }
            if (i==chars.length-1){
                reverse(start,i,chars);
            }
        }
        return String.valueOf(chars);
    }

    private void reverse(int start, int i, char[] chars) {
        char temp;
        while (start<i){
            temp = chars[start];
            chars[start] = chars[i];
            chars[i] = temp;
            start++;
            i--;
        }
    }
}
