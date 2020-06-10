package newcode;

import java.util.Scanner;

/**
 * @program: algorithm
 * @description:链接：https://www.nowcoder.com/questionTerminal/ac61207721a34b74b06597fe6eb67c52
 *
 * 给定一个十进制数M，以及需要转换的进制数N。将十进制数M转化为N进制数
 *
 * 输入描述:
 * 输入为一行，M(32位整数)、N(2 ≤ N ≤ 16)，以空格隔开。
 * 输出描述:
 * 为每个测试实例输出转换后的数，每个输出占一行。如果N大于9，
 *      则对应的数字规则参考16进制（比如，10用A表示，等等）
 * 示例1
 * 输入
 * 7 2
 * 输出
 * 111
 * @author: zzh
 * @create: 2020-05-25 15:55
 **/
public class 进制转换 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        StringBuilder result = new StringBuilder();
        String table ="0123456789ABCDEF";
        if (m<0){
            m=-m;
            System.out.print("-");
        }
        while (m>0){ ;
            result.append(table.charAt(m%n));
            m/=n;
        }
        result.reverse();
        System.out.println(result.toString());
    }
}
