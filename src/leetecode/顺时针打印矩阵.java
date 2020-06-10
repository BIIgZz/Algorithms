package leetecode;

import java.util.Scanner;

/**
 * @program: algorithm
 * @description: 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * 示例 1：
 *
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 * 示例 2：
 *
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 *
 * @author: zzh
 * @create: 2020-06-05 18:18
 **/
public class 顺时针打印矩阵 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matris ={{1,2,3},{4,5,6},{7,8,9}};
       int[] res = spiralOrder(matris);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
    public static  int[] spiralOrder(int[][] matrix) {
            if (matrix.length==0) return new int[0];
             int l=0;
             int r=matrix[0].length-1;
             int up = 0;
             int down = matrix.length-1;
             int[]  res = new int[(r+1)*(down+1)];
             int x=0;
             while (true){
                 for (int i=l;i<=r;i++) res[x++]=matrix[up][i];
                 if (++up>down) break;
                 for (int i=up;i<=down;i++) res[x++]=matrix[i][r];
                 if (--r<l) break;
                 for (int i=r;i>=l;i--) res[x++]=matrix[down][i];
                 if (up>--down) break;
                 for (int i=down;i>=up;i--) res[x++]=matrix[i][l];
                 if (++l>r) break;
             }
             return res;
    }
}
