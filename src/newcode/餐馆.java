package newcode;

import java.util.*;

/**
 * @program: algorithm
 * @description:
 * 链接：https://www.nowcoder.com/questionTerminal/d2cced737eb54a3aa550f53bb3cc19d0
 * 来源：牛客网

 * 某餐馆有n张桌子，每张桌子有一个参数：a 可容纳的最大人数；
 *      有m批客人，每批客人有两个参数:b人数，c预计消费金额。
 *      在不允许拼桌的情况下，请实现一个算法选择其中一部分客人，使得总预计消费金额最大
 *
 * 输入描述:
 *      输入包括m+2行。 第一行两个整数n(1 <= n <= 50000),m(1 <= m <= 50000) 第二行为n个参数a,
 * 即每个桌子可容纳的最大人数,以空格分隔,范围均在32位int范围内。 接下来m行，每行两个参数b,c。
 * 分别表示第i批客人的人数和预计消费金额,以空格分隔,范围均在32位int范围内。
 * 输出描述:
 * 输出一个整数,表示最大的总预计消费金额
 * 示例1
 * 输入
 * 3 5 2 4 2 1 3 3 5 3 7 5 9 1 10
 * 输出
 * 20
 *
 * 思路：优先选消费额度大的客人安排就餐
 * 对客人按照消费额度排序（大->小）
 * 对桌子按照容量排序（大->小）
 * 选取当前消费额度最大客人：
 * 1.如果没有桌子可用，结束；
 * 2.如果人数过多无法安排，跳过；
 * 3.如果可安排，则找到最合适的桌位，可就餐的桌位中容量最小的；
 *   3.1向这批客人收费；
 *   3.2将桌子从可用资源中删除；
 * 直到没有桌子可用或所有客人全部安排
 * @author: zzh
 * @create: 2020-05-25 17:09
 **/
public class 餐馆 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int table[] = new int[n];
        for (int i = 0; i < n; i++) {
            table[i] = scanner.nextInt();
        }
        Arrays.sort(table);
        PriorityQueue<Customer> queue = new PriorityQueue<>();
        for (int i = 0; i < m; i++) {
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                if (b<table[n-1])
                    queue.add(new Customer(b,c));
        }
        boolean visited[] = new boolean[n];
        long sum = 0;
        int count = 0;
        while (queue!=null){
            Customer customer = queue.poll();
            for (int i = 0; i < n; i++) {
                if (customer.getNum()<table[i]&&!visited[i]){
                    sum+=customer.getMoney();
                    count++;
                    visited[i] = true;
                    break;
                }
            }
            if (count==n){
                break;
            }
        }

        System.out.println(sum);
    }
}
class Customer implements Comparable<Customer>{
    private int num;
    private int money;

    public Customer(int num, int money) {
        this.num = num;
        this.money = money;
    }

    public int getNum() {
        return num;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public int compareTo(Customer o) {
        if (this.money>o.money)
             return -1;
        else if (this.money<o.money)
            return 1;
        else{
            if (this.num>o.num)
                return 1;
            else if (this.num<o.num)
                return -1;
            else
                return 0;
        }
    }
}
