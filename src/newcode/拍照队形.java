package newcode;

import java.util.Scanner;

/**
 * @program: algorithm
 * @description:
 * 猿辅导公司的 N位（N>=4）研发同学组织了一次秋游活动，某同学带了个无人机在高空拍照，活动结束时，
 * 先拍了一张所有同学排成公司猴头Logo的照片， 接着有人提议再排成“猿”的首字母Y字形来拍一张合照。
 * 用字符串中的每一个字符（不是换行符或结束符'\0'）代表一位老师，输出排好后的队形。
 * 要求 Y字除去中心点外，上下半部分等高，按照从左到右，从上到下进行排序。队形中没人的部分用空格占位。
 * 输入数据保证可以排出一个完整的Y字，即长度为 3k+1 （k>=1）
 * 例如: 7个 x ，排成队形为（为了方便说明，这里用‘-’代替空格）：
 * x---x
 * -x-x
 * --x
 * --x
 * --x
 * @author: zzh
 * @create: 2020-06-04 20:24
 **/
public class 拍照队形 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num < 4 || (num - 1) % 3 != 0)
            return;
        int k = (num-1)/3;
        char[] strArray = new char[num];
        for (int i = 0; i < num; i++) {
           String str = in.next();
           strArray[i] = str.toCharArray()[i];
        }

        //打印上半部分
        int temp = 0;
        int j = 0;
        for (int i = 0; i < k; i++) {
            int center = 2*(k-i)-1;
            temp = i;
            //打印空格
            while (temp>0){
                System.out.print(" ");
                temp--;
            }
            //打印第一个文字
            System.out.print(strArray[j]);
            j++;
            //打印空格
            while (center>0){
                System.out.print(" ");
                center--;
            }
            //打印第二个文字
            System.out.print(strArray[j]);
            j++;
            System.out.println();
        }
        //打印下部分
        for (int i = 0 ; i<k+1;i++){
             temp =k;
            //打印空格k
            while(temp>0){
                System.out.print(" ");
                temp--;
            }
            System.out.println(strArray[j]);
            j++;
            System.out.println();
        }
    }
}
