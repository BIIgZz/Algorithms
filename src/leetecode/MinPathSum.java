package leetecode;
/**
 *
 *
 *@description: leetecode 64. 最小路径和
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 *@author: zzh
 *@time: 2021/3/26 下午8:28
 * 
 */
public class MinPathSum {
    public int minPathSum(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i==0&&j==0) continue;
                else if (i==0)
                    grid[i][j] = grid[i][j-1]+grid[i][j];
                else if (j==0)
                    grid[i][j] = grid[i-1][j]+grid[i][j];
                else
                    grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
