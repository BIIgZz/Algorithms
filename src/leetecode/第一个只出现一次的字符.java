package leetecode;



import java.util.HashMap;

/**
 * @program: algorithm
 * @description: 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 *
 *
 * 示例:
 *
 * s = "abaccdeff"
 * 返回 "b"
 *
 * s = ""
 * 返回    s"
 *
 * @author: zzh
 * @create: 2020-06-09 19:42
 **/
public class 第一个只出现一次的字符 {
    public char firstUniqChar(String s) {
        HashMap<Character, Boolean > hashMap = new HashMap<>();
        for (char c :s.toCharArray()){
            hashMap.put(c,!hashMap.containsKey(c));
        }
        for (char c:s.toCharArray()) {
            if (hashMap.get(c)) return c;
        }
        return ' ';
    }

    public static void main(String[] args) {
        第一个只出现一次的字符 a = new 第一个只出现一次的字符();
        char leetcode = a.firstUniqChar("leetcode");
        System.out.println(leetcode);
    }
}
