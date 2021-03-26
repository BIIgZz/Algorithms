package leetecode;
/**
 *
 *
 *@description: leetecode 83. 删除排序链表中的重复元素
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
 *
 * 返回同样按升序排列的结果链表。
 *@author: zzh
 *@time: 2021/3/26 下午4:14
 * 
 */
import utils.ListNode;
public class DeleteDuplicatesII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null)
            return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow!=null&&fast!=null){
            while (fast!=null&&slow.val==fast.val)
                fast=fast.next;

            slow.next=fast;
            slow = fast;
            }
        return head;
        }

}
