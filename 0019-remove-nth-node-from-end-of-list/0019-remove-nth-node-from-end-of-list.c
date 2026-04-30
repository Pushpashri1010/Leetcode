/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode* temp=head;
    struct ListNode* temp1=head;
    int count=0;
    struct ListNode* prev;
        while(temp!=NULL){
            count+=1;
            temp=temp->next;
        }
        int re=(count-n)+1;
        count=0;
        while(temp1!=NULL){
           count+=1;
           if(count==re){
                if(count==1){
                    if(head->next!=NULL){
                        prev=head;
                        head=head->next;
                        free(prev);
                        break;
                    }
                    else {
                        free(head);
                        return NULL;
                    }
                }
                if(temp1->next!=NULL){
                prev->next=temp1->next;
                free(temp1);
                break;
                }
                else{
                    prev->next=NULL;
                    free(temp1);
                    break;
                }
           }
           prev=temp1;
           temp1=temp1->next;
        }
        return head;
}