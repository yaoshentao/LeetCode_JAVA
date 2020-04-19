package cn.ques82;
//没看懂！！！！   
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummyHead = new ListNode(-1);
        ListNode prev = dummyHead;
        int lastv = head.val - 1;
        while (head != null) {
            if ((head.next == null || head.val != head.next.val) && lastv != head.val) {
                prev.next = head;
                prev = head;
            } else {
                prev.next = null;
                lastv = head.val;
            }
            head = head.next;
        }
        return dummyHead.next;
    }
}
class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}