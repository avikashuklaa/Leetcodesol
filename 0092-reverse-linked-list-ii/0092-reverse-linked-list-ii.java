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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode temp = head;
       
        int count=0;
        
        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        count=count+1;
        temp = head;
        int[] arr = new int[count];
      
        
        for(int p=0; p<count; p++){
            arr[p] = temp.val;
            temp=temp.next;
        }
        
        
        int l = left-1;
        int r = right-1;
        
        while(l<r){
            int abc = arr[l];
            arr[l]=arr[r];
            arr[r]=abc;
            l++;
            r--;
        }
        temp = head;
        for(int a=0; a<arr.length; a++){
            temp.val = arr[a];
            temp = temp.next;
        }
        temp= null;
        
        return head;
        
        
    }
}