package leetecode.stack;

import java.util.Stack;

/**
 *
 *
 *@description: leetecode.stack 20. 有效的括号
 * 定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 *@author: zzh
 *@time: 2021/4/1 下午9:52
 * 
 */

public class IsValid {

    public boolean isValid(String s) {
        boolean res = true;
        if (s.length()==0)
            return  res;
        if (s.length()%2!=0)
            return false;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            //遇到左括号，将对应右括号压栈
            if(s.charAt(i)=='('){
                stack.add(')');
            }else if(s.charAt(i)=='{'){
                stack.add('}');
            }else if(s.charAt(i)=='['){
                stack.add(']');
            }else if  (stack.isEmpty()||stack.peek()!=s.charAt(i)){
            //如果遇到栈空、右括号但是和栈顶不同返回false
               return  false;
            }else{
               // 栈顶和当前符号相等弹栈
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
