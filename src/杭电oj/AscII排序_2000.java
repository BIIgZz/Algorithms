package 杭电oj;

import java.util.Scanner;

/**
 * @program: algorithm
 * @description: AscII排序
 * Problem Description
 * 输入三个字符后，按各字符的ASCII码从小到大的顺序输出这三个字符。
 * Input
 * 输入数据有多组，每组占一行，有三个字符组成，之间无空格。
 * Output
 * 对于每组输入数据，输出一行，字符中间用一个空格分开。
 * Sample Input
 * qwe
 * asd
 * zxc
 * Sample Output
 * e q w
 * a d s
 * c x z
 * Author
 * lcy
 *
 * @author: zzh
 * @create: 2020-05-02 17:55
 **/
public class AscII排序_2000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            char[] str = scanner.next().toCharArray();
            char temp1 ;
            for (int i=0;i<3;i++){
                for (int j = 0; j < 3 ; j++) {
                    if ((int)str[i]<(int)str[j]){
                       temp1=str[i];
                       str[i]=str[j];
                       str[j]=temp1;
                    }
                }

            }
            for (int i = 0; i < 3; i++) {
                System.out.print(str[i]);

                if (i<2)
                    System.out.print(" ");
                else System.out.println();
            }
        }
    }
//    public static void swap(char a ,char b){
//
//        temp1 = a;
//        a = b;
//        b=temp1;
//    }
}
