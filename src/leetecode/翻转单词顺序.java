package leetecode;

/**
 * @program: algorithm
 * @description:
 *
 * 输入一个英文句子，翻转句子中单词的顺序，
 * 但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理
 * 。例如输入字符串"I am a student. "，则输出"student. a am I"。   
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * @author: zzh
 * @create: 2020-06-08 19:39
 **/
public class 翻转单词顺序 {
    public String reverseWords(String s) {
        s=s.trim();
        int i = s.length()-1;
        int j = i;
        StringBuilder res = new StringBuilder();
        while (j>=0){
            while (j>=0&&s.charAt(j)!=' ')j--;
            res.append(s.substring(j+1,i+1)+" ");
            while (j>=0&&s.charAt(j)==' ')j--;
            i=j;
        }
        return res.toString();
    }
}
