package Offer;

/**
 * @program: Algorithms
 * @description: 剑指 Offer 04. 二维数组中的查找
 * @author: zzh
 * @create: 2021-06-25 10:53
 **/
public class FindNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        int i = matrix.length-1;
        int j=0;
        while (i>=0&&j<matrix[0].length){
            if (matrix[i][j]>target)i--;
            else if (matrix[i][j]<target)j++;
            else return true
        }
        return false;

    }
}
