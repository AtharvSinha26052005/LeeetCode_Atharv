/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) 
    {
        if (head == null || head.next == null || k == 0) return head;

        ListNode temp = head; int c=1;
        while(temp.next!=null) {c++;temp=temp.next;}

        if(k%c==0) return head;

        else 
        {
            temp.next=head;
            int n=c-(k%c);
            ListNode temp1=head;

            while(n-->1)
            {
                temp1=temp1.next;
            }
            
           ListNode temp2 = temp1.next;
           head=temp2;
           temp1.next=null;
           return head;
        }


    }
}