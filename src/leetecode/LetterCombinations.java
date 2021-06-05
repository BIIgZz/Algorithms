package leetecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: Algorithms
 * @description: 17. 电话号码的字母组合
 *
 *  给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 *
 *   给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 * @author: zzh
 * @create: 2021-04-24 10:13
 **/
public class LetterCombinations {
    List<String> res = new ArrayList<>();
    Map<Character,String> map = new HashMap<Character,String>(){
        {
            put('2',"abc");
            put('3',"def");
            put('4',"ghi");
            put('5',"jkl");
            put('6',"mno");
            put('7',"pqrs");
            put('8',"tuv");
            put('9',"wxyz");
        }
    };
    public List<String> letterCombinations(String digits) {
        if (digits.length()==0) return new ArrayList<>();
        dfs(digits,0,"");
        return res;
    }

    private void dfs(String digits, int i, String s) {
        if (i==digits.length()){
            res.add(s);
            return;
        }
        String let = map.get(digits.charAt(i));
        for(int k = 0; k < let.length(); k++) { //遍历所有字母集

            s += let.charAt(k);   //选当前字母
            dfs(digits, i + 1, s); //递归匹配后面的字母
            s = s.substring(0, i);  //回溯，不选当前字母
        }

    }
}
