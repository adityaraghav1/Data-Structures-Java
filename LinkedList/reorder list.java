// TC O(n)
// SC O(1)
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head; //Find Middle
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next; //Break in 2 parts - firsthalf & second half
        slow.next = null;
        ListNode prev = null; // Reverse 2nd half
        while(second!=null){
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }
        ListNode first = head; // Merge alternatively
        second = prev;
        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}
