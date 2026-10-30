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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = head;
        int length =0;
        while(prev!=null){
         length++;
         prev = prev.next;
        }
        if(length<k){
            return head;
        }
        ListNode temp = null;
        ListNode curr = head;
        for(int i=1; i<=k ; i++){
          ListNode forward = curr.next;
          curr.next = prev;
          prev =curr;
          curr = forward;
        }
        ListNode recursivehead = reverseKGroup(curr,k);
        head.next = recursivehead;
        return prev;
    }
}