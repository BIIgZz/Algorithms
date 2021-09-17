package leetecode;

import java.util.HashMap;

/**
 *
 *
 *@description: leetecode 3. 无重复字符的最长子串
 *@author: zzh
 *@time: 2021/3/10 下午5:15
 * 
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
       if (s.length()==0)
           return 0;
       int left = 0;
       int max = 0;
       HashMap<Character,Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);

        }
    }
    public static void main(String[] s){
        LengthOfLongestSubstring length = new LengthOfLongestSubstring();
        int abcabcbb = length.lengthOfLongestSubstring("abcabcbb");
        System.out.println(abcabcbb);
    }
}
