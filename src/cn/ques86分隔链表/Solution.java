package cn.ques86分隔链表;


 class ListNode {
     int val;
     ListNode next;ListNode(int x) { val = x; }
}

//直接取出大的和小的构成链表
//就是对于链表进行快排的集合
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode big = new ListNode(0);
        ListNode small = new ListNode(0);

        ListNode bigHead = big;
        ListNode smallHead = small;


        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                big.next = head;
                big = big.next;
            }
            head = head.next;
        }
        small.next = bigHead.next;
        big.next = null;

        return smallHead.next;
    }
}
