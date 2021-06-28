package Offer;

/**
 * @program: Algorithms
 * @description: 剑指 Offer 06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 * @author: zzh
 * @create: 2021-06-27 10:11
 **/
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
public class ReversePrint {
    int count = 0;
    public int[] reversePrint(ListNode head) {
        ListNode newHead = reverse(head);
        int res[] = new int[count];
        for (int i = 0; i < count; i++) {
            res[i] = newHead.val;
            newHead = newHead.next;
        }
        return res;
    }

    private ListNode reverse(ListNode head) {
        if (head.next==null || head==null){
            return head;
        }
        count++;
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    
}
