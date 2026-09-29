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
         ArrayList<Integer> list = new ArrayList<>();

       
        ListNode temp = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

       
        int i = left - 1;
        int j = right - 1;

        while (i < j) {
            int swap = list.get(i);
            list.set(i, list.get(j));
            list.set(j, swap);

            i++;
            j--;
        }

        temp = head;
        int k = 0;

        while (temp != null) {
            temp.val = list.get(k);
            temp = temp.next;
            k++;
        }

        return head;
    }
}
        
    
