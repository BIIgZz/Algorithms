package 杭电oj;

import java.util.Scanner;

/**
 * @program: algorithm
 * @description: 计算两点间的距离
 * Problem Description
 * 输入两点坐标（X1,Y1）,（X2,Y2）,计算并输出两点间的距离。
 * Input
 * 输入数据有多组，每组占一行，由4个实数组成，分别表示x1,y1,x2,y2,数据之间用空格隔开。
 * Output
 * 对于每组输入数据，输出一行，结果保留两位小数。
 * Sample Input
 * 0 0 0 1
 * 0 1 1 0
 * Sample Output
 * 1.00
 * 1.41
 * @author: zzh
 * @create: 2020-05-02 20:13
 **/
public class Main2001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            double x1=input.nextDouble();
            double y1 = input.nextDouble();
            double x2 = input .nextDouble();
            double y2 =  input.nextDouble();
            double result = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
            System.out.println(String.format("%.2f",result));

        }
    }
}
