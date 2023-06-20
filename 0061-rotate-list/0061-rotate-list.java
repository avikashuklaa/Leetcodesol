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
        
        if(head==null || head.next==null){
            return head;
        }
        
        
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        
        int find = k%count;
        ListNode prev=null;
        ListNode node = head;
        
        for(int i=0; i<find; i++){
            
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