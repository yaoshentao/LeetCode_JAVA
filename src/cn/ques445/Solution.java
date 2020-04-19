package cn.ques445;

class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null||l2==null) {
            return l1==null?l2:l1;
        }
        ListNode temp1=l1;
        ListNode temp2=l2;
        int len1=0;
        int len2=0;

        while(temp1!=null){
            len1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            len2++;
            temp2=temp2.next;
        }
        int diff=Math.abs(len1-len2);
        ListNode tempList=new ListNode(0);
        ListNode cur=tempList;
        while(diff!=0){
            cur.next=new ListNode(0);
            cur=cur.next;
            diff--;
        }

        if(len1<len2){
            cur.next=l1;
            l1=tempList.next;
        }else if(len1>len2){
            cur.next=l2;
            l2=tempList.next;
        }
        tempList.next=null;
        int carry=addLinkedList(tempList,l1,l2);
        if(carry!=0) {
            ListNode newNode=new ListNode(carry);
            newNode.next=tempList.next;
            tempList.next=newNode;
        }
        return tempList.next;
    }

    public  int addLinkedList(ListNode tempList,ListNode l1,ListNode l2){
        if(l1==null||l2==null){
            return 0;
        }
        int count=0;
        if(l1.next!=null&&l2.next!=null){
            count=addLinkedList(tempList,l1.next,l2.next);
        }
        int sum=l1.val+l2.val+count;
        ListNode newNode=new ListNode(sum%10);
        int carry=sum/10;
        newNode.next=tempList.next;
        tempList.next=newNode;
        return carry;
    }
}
