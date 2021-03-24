package leetecode;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 *
 *@description: leetecode 32. 最长有效括号
 * 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
 * 输入：s = "(()"
 * 输出：2
 * 解释：最长有效括号子串是 "()"
 * @author: zzh
 *@time: 2021/3/24 下午3:50
 * 
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        if (s.length()==0)
            return 0;
        Stack<Integer> stack = new Stack<>();
        int sum=0;
        stack.add(-1) ;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('){
                stack.add(i);
            }else {
                stack.pop();
                if (stack.empty()) {
                    stack.add(i);
                } else  {
                    sum=Math.max(sum,i-stack.peek());
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        int i = longestValidParentheses.longestValidParentheses(")()())");
        System.out.println(i);

    }
}
