package leetecode;
/**
 *
 *
 *@description: leetecode 191. 位1的个数
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 *输入：00000000000000000000000000001011
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
 *@author: zzh
 *@time: 2021/3/22 下午9:22
 * 
 */
public class HammingWeight {
    public int hammingWeight(int n) {
        if (n==0)
            return 0;
        int k=0;
        while(n!=0){
            n = n & (n-1);
            k++;
        }
        return k;
    }
}
