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
    public ListNode insertionSortList(ListNode head) {
        
        if(head == null || head.next==null) return head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode left = insertionSortList(head);
        ListNode right = insertionSortList(slow);

        return merge(left,right);
    }
    public ListNode merge(ListNode l1,ListNode l2){

        ListNode curr = new ListNode(0);
        ListNode dummy = curr;
        while(l1!=null && l2!=null){
        if(l1.val<l2.val){
            curr.next = l1;
            l1=l1.next;
        }
        else{
            curr.next = l2;
            l2 = l2.next;
        }
        curr = curr.next;
        }
        if(l1!=null) curr.next = l1;
        if(l2!=null) curr.next = l2;
        return dummy.next;
    }
    
}