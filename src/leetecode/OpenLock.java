package leetecode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 *
 *
 *@description: leetecode 752. 打开转盘锁
 * 输入：deadends = ["0201","0101","0102","1212","2002"], target = "0202"
 * 输出：6
 * 解释：
 * 可能的移动序列为 "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202"。
 * 注意 "0000" -> "0001" -> "0002" -> "0102" -> "0202" 这样的序列是不能解锁的，
 * 因为当拨动到 "0102" 时这个锁就会被锁定。
 *@author: zzh
 *@time: 2021/3/15 下午4:24
 * 
 */
public class OpenLock {
    private String plusOne(String s,int i){
        char[] ch = s.toCharArray();
        if(ch[i]=='9')
            ch[i]='0';
        else
            ch[i]+=1;
        return new String(ch);
    }

    private String minOne(String s,int i){
        char[] ch = s.toCharArray();
        if (ch[i] == '0')
            ch[i] = '9';
        else
            ch[i]-=1;
        return new String(ch);
    }
    public int openLock(String[] deadends, String target) {
        Set<String> deads = new HashSet<>();
        for (String s : deadends) {
            deads.add(s);
        }
        Set<String> visitd = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        int step = 0;
        q.offer("0000");
        visitd.add("0000");

        while (!q.isEmpty()){
            int size = q.size();
            for (int i=0;i<size;i++){
                String cur = q.poll();
                if (deads.contains(cur))
                    continue;
                if (cur.equals(target))
                    return step;

                for (int j = 0; j < 4; j++) {
                    String up = plusOne(cur,j);
                    if (!visitd.contains(up)){
                        q.offer(up);
                        visitd.add(up);
                    }
                    String down = minOne(cur,j);
                    if (!visitd.contains(down)){
                        q.offer(down);
                        visitd.add(down);
                    }
                }
            }
            step++;
        }
        return -1;
    }

    public static void main(String[] args) {
        OpenLock openLock = new OpenLock();
        //deadends = ["8888"], target = "0009";
        String[] deadends={"8888"};
        String target = "0009";
        int i = openLock.openLock(deadends, target);
        System.out.println(i);
    }
}
