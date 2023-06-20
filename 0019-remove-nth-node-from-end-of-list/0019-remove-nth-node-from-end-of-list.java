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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next==null){
            return null;
        }
        
        int count=0;
        ListNode temp = head;
        while(temp != null){
            temp=temp.next;
            count++;
        }
        
        int find = count-n;
        int i=0;
        
        temp=head;
        
        if(find==0){
            return head.next;
        }
        
        
        while(i!=find-1){
            temp = temp.next;
            i++;
        }
        
        if(i==find-1){
            temp.next=temp.next.next;
        }
        
        return head;
        
    }
}