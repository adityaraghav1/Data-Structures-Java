
public class Solution {
    public boolean hasCycle(ListNode head) {
// TC O(n) 
// SC O(1)

        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
