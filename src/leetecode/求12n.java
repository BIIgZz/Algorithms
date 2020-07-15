package leetecode;

/**
 * @program: algorithm
 * @description: 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 * @author: zzh
 * @create: 2020-06-23 22:18
 **/
public class 求12n {
    public int sumNums(int n) {
        if (n==0)
            return 0;
        return n+sumNums(n-1);
    }
}
