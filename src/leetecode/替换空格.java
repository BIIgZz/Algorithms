package leetecode;

/**
 * @program: algorithm
 * @description: 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * @author: zzh
 * @create: 2020-07-12 21:35
 **/
public class 替换空格 {
    public String replaceSpace(String s) {
        String res=s.replace(" ","%20");
        return res;
    }
}
