// TC O(n)
// Sc O(1)
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode current = slow;
        while(current != null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        ListNode firsthalf = head;
        ListNode secondhalf = prev;
        while(secondhalf != null){
        if(firsthalf.val != secondhalf.val){
            return false;
        }
        firsthalf = firsthalf.next;
        secondhalf = secondhalf.next;
        }
        return true;
    }
}
