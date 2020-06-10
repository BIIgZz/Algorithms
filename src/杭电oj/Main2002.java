package 杭电oj;

import java.util.Scanner;

/**
 * @program: algorithm
 * @description: 计算球体积
 * Problem Description
 * 根据输入的半径值，计算球的体积。
 * Input
 * 输入数据有多组，每组占一行，每行包括一个实数，表示球的半径。
 * Output
 * 输出对应的球的体积，对于每组输入数据，输出一行，计算结果保留三位小数。
 * Sample Input
 * 1
 * 1.5
 * Sample Output
 * 4.189
 * 14.137
 * Hint
 * #define PI 3.1415927
 * @author: zzh
 * @create: 2020-05-06 20:20
 **/
public class Main2002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.1415927;
        while (input.hasNext()){
            double round  = input.nextDouble();
            double v = ((double)4/3)*PI*round*round*round;
            System.out.println(String.format("%.3f",v));
        }
    }


}
