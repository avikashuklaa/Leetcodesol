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
    public ListNode partition(ListNode head, int x) {
        
    
        ListNode temp=head;        
        ListNode curr=new ListNode(0, null);
        ListNode node=curr;
        ListNode sub=new ListNode(0, null);
        ListNode neww=sub;
        ListNode subb=neww;
                
        while(temp!=null){
            if(temp.val < x){
                node.next=temp; 
                node=node.next;
            }
            else if(temp.val > x || temp.val==x){
                neww.next=temp;
                neww=neww.next;
            }
            temp=temp.next;           
        }
        neww.next=null;
        
        node.next=sub.next;
       
       
        
        return curr.next;
    }
}