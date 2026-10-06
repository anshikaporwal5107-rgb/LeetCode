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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ArrayList <Integer>odd = new ArrayList<>();
         ArrayList <Integer>even = new ArrayList<>();
         ListNode temp =  head;
         int position = 1;
         while(temp!=null){
            if(position %2==1)
            odd.add(temp.val);
            else
            even.add(temp.val);
            temp=temp.next;
            position++;}
         odd.addAll(even);
         ListNode dummy = new ListNode(0);
         ListNode curr=dummy;
         for(int value : odd){
            curr.next = new ListNode(value);
            curr = curr.next;}
         return dummy.next;}}

        
        
    
