package 杭电oj;

import java.util.Scanner;

/**
 * @program: algorithm
 * @description: 求绝对值
 * Problem Description
 * 求实数的绝对值。
 * Input
 * 输入数据有多组，每组占一行，每行包含一个实数。
 * Output
 * 对于每组输入数据，输出它的绝对值，要求每组数据输出一行，结果保留两位小数。
 * Sample Input
 * 123
 * -234.00
 * Sample Output
 * 123.00
 * 234.00
 * @author: zzh
 * @create: 2020-05-06 20:33
 **/
public class Main2003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            double num = input.nextDouble();
            num = Math.abs(num);
            System.out.println(String.format("%.2f",num));
        }
    }
}
