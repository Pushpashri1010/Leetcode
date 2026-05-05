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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
                return head;
        }
        int len=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            len+=1;
        }
        k=k%len;
        for(int i=0;i<k;i++){
            ListNode temp=head;
            ListNode prev=null;
           
              while(temp.next!=null){
                prev=temp;
                temp=temp.next;
              }
              prev.next=null;
              temp.next=head;
              head=temp;
        }
        return head;
    }
}