package Offer;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;



/**
 * @program: Algorithms
 * @description: 剑指 Offer 38. 字符串的排列
 * 入一个字符串，打印出该字符串中字符的所有排列。
 *
 *  
 *
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 *
 *  
 *
 * 示例:
 *
 * 输入：s = "abc" List<String> res = new LinkedList<>();
 *     char[] c;
 *     public String[] permutation(String s) {
 *         c = s.toCharArray();
 *         dfs(0);
 *         return  res.toArray(new String[res.size()]);
 *     }
 *
 *     private void dfs(int x) {
 *         if (x == c.length-1){
 *             res.add(String.valueOf(c));
 *             return;
 *         }
 *         HashSet<Character> set = new HashSet<>();
 *         for (int i = 0; i < c.length; i++) {
 *             if (set.contains(c[i]))continue;
 *             set.add(c[i]);
 *             swap(i,x);
 *             dfs(x+1);
 *             swap(i,x);
 *         }
 *     }
 *
 *     private void swap(int i, int x) {
 *         char tmp = c[i];
 *         c[i] = c[x];
 *         c[x] = tmp;
 *     }
 * 输出：["abc","acb","bac","bca","cab","cba"]
 *
 * @author: zzh
 * @create: 2021-06-22 20:59
 **/
public class Permutation {

}
