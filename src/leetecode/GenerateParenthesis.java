package leetecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Algorithms
 * @description: 22. 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 *
 * @author: zzh
 * @create: 2021-06-05 22:58
 **/
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List res =  new ArrayList<String>();
        if (n<=0){
            return res;
        }
        dfs("",n,n,res);
        return res;

    }

    private void dfs(String s, int left, int right, List res) {
        if (left==0&&right==0){
            res.add(s);
            return;
        }
        if (left>right)
            return;
        if (left>0){
            dfs(s+"(",left-1,right,res);
        }
        if (right>0){
            dfs(s+")",left,right-1,res);
        }
    }

}
