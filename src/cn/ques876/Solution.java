package cn.ques876;

public class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode p = head;
            int len = 0;
            while(p.next!=null)
            {
                p=p.next;
                len++;
            }
            int value = len / 2;
            p = head;
            for (int i = 0; i < value; i++) {
                p = p.next;
            }
            return p;
        }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
