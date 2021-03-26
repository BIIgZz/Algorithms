package leetecode;

/**
 *
 *
 *@description: leetecode 82. 删除排序链表中的重复元素 II
 * 存在一个按升序排列的链表，
 * 给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
 * 返回同样按升序排列的结果链表。
 *
 *@author: zzh
 *@time: 2021/3/25 下午4:06
 * 
 */

import utils.ListNode;
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;

    }
}
