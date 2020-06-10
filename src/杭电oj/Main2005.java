package 杭电oj;

import java.util.Scanner;

/**
 * @program: algorithm
 * @description: 第几天？
 * Problem Description
 * 给定一个日期，输出这个日期是该年的第几天。
 * Input
 * 输入数据有多组，每组占一行，数据格式为YYYY/MM/DD组成，具体参见sample input ,另外，可以向你确保所有的输入数据是合法的。
 * Output
 * 对于每组输入数据，输出一行，表示该日期是该年的第几天。
 * Sample Input
 * 1985/1/20
 * 2006/3/12
 * Sample Output
 * 20
 * 71
 * @author: zzh
 * @create: 2020-05-06 20:57
 **/
public class Main2005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ping = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] run = {31,29,31,30,31,30,31,31,30,31,30,31};
        while (input.hasNext()){
            String data = input.next();
            String[] split = data.split("/");
            int sumDay=0;
            if (isRunYear(Integer.parseInt(split[0]))){
                for (int i = 0; i < Integer.parseInt(split[1])-1; i++) {
                    sumDay+=run[i];
                }
            }else{
                for (int i = 0; i < Integer.parseInt(split[1])-1; i++) {
                    sumDay+=ping[i];
                }
            }
            System.out.println(sumDay+Integer.parseInt(split[2]));

        }
    }

    private static boolean isRunYear(int parseInt) {
        if (parseInt%400==0||(parseInt%4==0&&(parseInt%100!=0))){
            return true;
        }else{
            return false;
        }
    }
}
