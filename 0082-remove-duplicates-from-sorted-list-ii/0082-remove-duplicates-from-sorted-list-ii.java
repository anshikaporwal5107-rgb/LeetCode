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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy = new ListNode (0);
        ListNode result= dummy;
        ListNode curr = head;
        
            while(curr != null)
            {
                int count =0;
                ListNode temp=curr;
                while(temp!=null && temp.val==curr.val )
                {
                    count++;
                    temp=temp.next;
                }
                if (count==1)
                {
                    result.next=curr;
                    result=result.next;
                }
                curr=temp;

            }
            result.next = null;
            return dummy.next;

        
    }
}