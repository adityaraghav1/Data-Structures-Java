// TC O(n)
// SC O(1)
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(0);
        ListNode largeDummy = new ListNode(0);
        ListNode smallTail = smallDummy;
        ListNode largeTail = largeDummy;
        ListNode curr = head;
        while(curr!=null){
            if(curr.val < x){
                smallTail.next = curr;
                smallTail = smallTail.next;
            }
            else{
                largeTail.next = curr;
                largeTail = largeTail.next;
            } 
            curr = curr.next;
        }
        largeTail.next = null;
        smallTail.next = largeDummy.next;
        return smallDummy.next;
    }
}
