package leetecode;

/**
 *
 *
 *@description: leetecode  200. 岛屿数量
 *@author: zzh
 *@time: 2021/3/12 下午5:34
 *
 */
public class NumIslands {
    public void dfs(char[][] grid,int r,int c){
        if (r<0||r>=grid.length||c<0||c>= grid[0].length){
            return;
        }
        if (grid[r][c]!='1')
            return;
        grid[r][c] = '2';

        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
    }


    public int numIslands(char[][] grid) {
        if (grid==null||grid.length==0)
            return  0;
        int r,c,landNums=0;
        for ( r = 0; r < grid.length; r++) {
            for ( c = 0; c < grid[0].length; c++) {
                if (grid[r][c]=='1'){
                    landNums++;
                    dfs(grid,r,c);
                }
            }
        }
        return landNums;
    }

    public static void main(String[] args) {
        NumIslands numIslands = new NumIslands();
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
                };
        int i = numIslands.numIslands(grid);
        System.out.println(i);
    }
}
