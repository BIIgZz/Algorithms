package newcode;

import java.util.Scanner;

/**
 * @program: algorithm
 * @description: 题目描述
 * 小青蛙有一天不小心落入了一个地下迷宫,小青蛙希望用自己仅剩的体力值P跳出这个地下迷宫。
 * 为了让问题简单,假设这是一个n*m的格子迷宫,迷宫每个位置为0或者1,0代表这个位置有障碍物,小青蛙达到不了这个位置;
 * 1代表小青蛙可以达到的位置。小青蛙初始在(0,0)位置,地下迷宫的出口在(0,m-1)(保证这两个位置都是1,
 * 并且保证一定有起点到终点可达的路径),小青蛙在迷宫中水平移动一个单位距离需要消耗1点体力值,
 * 向上爬一个单位距离需要消耗3个单位的体力值,向下移动不消耗体力值,当小青蛙的体力值等于0的时候还没有到达出口,
 * 小青蛙将无法逃离迷宫。现在需要你帮助小青蛙计算出能否用仅剩的体力值跳出迷宫(即达到(0,m-1)位置)。
 * 
 * 输入描述:
 * 输入包括n+1行:
 *  第一行为三个整数n,m(3 <= m,n <= 10),P(1 <= P <= 100)
 *  接下来的n行:
 *  每行m个0或者1,以空格分隔
 * @author: zzh
 * @create: 2020-06-02 21:06
 **/
public class 地下迷宫 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //输入矩阵
        int n = scanner.nextInt();  //长
        int m = scanner.nextInt();  //宽
        int p = scanner.nextInt();  //体力值
        int[][] migong = new int[n][m];
        int tiLi[] = {1,3,0};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                migong[i][j] = scanner.nextInt();
            }
        }
        System.out.println(pathOut(migong, n, m,p));
    }
    static String s = "";
    private static String  pathOut(int[][] a,int n,int m,int p) {
        if (p<=0)
            return "Can not escape!";
        boolean flag[][] = new boolean[n][m];
        findPath(n,m,a,0,0,"",flag,p);
        return s;
    }

    private static void findPath(int n, int m, int[][] a, int x, int y, String res, boolean[][] flag, int p) {
        if (x==0&&y==m-1&&a[0][m-1]==1){
            if (p>=0)
                s=res +"[0,"+(m-1)+"]";
            else
                s = "Can not escape!";
            return;
        }

        if (x<n&&y<m&&p>0&&x>=0&&y>=0&&a[x][y]==1&&!flag[x][y]){
            flag[x][y] = true;
            res +=  "["+x+","+y+"],";
            //向右
            findPath(n, m, a, x, y+1, res, flag, p-1);
            //向下
            findPath(n, m, a, x+1, y, res, flag, p);
            //向左
            findPath(n, m, a, x, y-1, res, flag, p-1);

            //向上
            findPath(n, m, a, x-1, y, res, flag, p-3);
        }
    }

}
