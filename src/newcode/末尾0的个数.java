package newcode;

import java.util.Scanner;

/**
 * @program: algorithm
 * @description:
 * 链接：https://www.nowcoder.com/questionTerminal/6ffdd7e4197c403e88c6a8aa3e7a332a
 * 来源：牛客网
 *
 * 输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
 * 输入描述:
 * 输入为一行，n(1 ≤ n ≤ 1000)
 * 输出描述:
 * 输出一个整数,即题目所求
 * 示例1
 * 输入
 * 10
 * 输出
 * 2
 * @author: zzh
 * @create: 2020-05-25 16:50
 **/
public class 末尾0的个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for(int i = n; i >= 5; i--) {
            int tmp = i;
            while(tmp % 5 == 0) {
                res++;
                tmp /= 5;
            }
        }
        System.out.println(res);
    }
}
