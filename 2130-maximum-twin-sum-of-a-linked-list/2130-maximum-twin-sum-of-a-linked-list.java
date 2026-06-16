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
    public int pairSum(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode temp=head;
        ListNode temp1=head;
        int count=0;
        while(temp!=null){
            count+=1;
            s.push(temp.val);
             temp=temp.next;
        }
        int n=count/2;
        int max=0;
        while(temp1!=null && count>0){
            int n1=temp1.val;
            int sum=n1+s.pop();
            max=Math.max(max,sum);
            temp1=temp1.next;
            count-=1;
        }
        return max;
    }
}