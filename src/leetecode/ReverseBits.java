package leetecode;
/**
 *
 *
 *@description: leetecode 190. 颠倒二进制位
 *
颠倒给定的 32 位无符号整数的二进制位。
 *@author: zzh
 *@time: 2021/3/29 下午9:55
 * 
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;

    }
}

