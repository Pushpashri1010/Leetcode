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
    public ListNode deleteMiddle(ListNode head) {
        int count=0,n=0;
        ListNode temp=head;
        ListNode temp1=head;
        ListNode prev=head;
        while(temp!=null){
            count+=1;
            temp=temp.next;
        }
        n=count/2;
        n=n+1;
        if(n==1){
            head=null;
            return head;
        }
        
        int i=1;
        while(temp1!=null){
           if(i==n){
              if(temp1.next==null){
                prev.next=null;
              }
              else{
                prev.next=temp1.next;
              }
              return head;
           }
           prev=temp1;
           temp1=temp1.next;
           i+=1;
        }
        return head;
    }
}