package leetecode;

/**
 * @program: algorithm
 * @description:
 *
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B 中的元素
 *              B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 *
 *
 *    示例:  输入: [1,2,3,4,5]
 *          输出: [120,60,40,30,24]
 *
 *
 *
 *     来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: zzh
 * @create: 2020-06-11 20:44
 **/
public class 构建乘积数组 {
    public int[] constructArr(int[] a) {
        if (a.length==0)
            return new int[0];
        int b[] = new int[a.length];
        //左边的乘积
        for (int i = 0,temp =1; i < a.length; i++) {
            b[i] = temp;
            temp *=a[i];
        }
        //左边的乘积乘以右边的乘积
        for (int i = a.length-1,temp = 1; i >=0; i--) {
            b[i] *= temp;
            temp *= a[i];
        }
        return b;
    }
}
