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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return ;
        }

        Stack<ListNode> stack = new Stack<>();
        ListNode ptr = head;

        while(ptr != null){
            stack.push(ptr);
            ptr = ptr.next;
        }

        int count = (stack.size()-1)/2;
        ptr = head;

        while(count-- > 0){
            ListNode top = stack.pop();
            ListNode temp = ptr.next;
            ptr.next = top;
            top.next = temp;
            ptr = temp; 
        }

        stack.pop().next = null;
    }
}
