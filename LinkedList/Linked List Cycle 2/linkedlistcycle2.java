public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodeSeen = new HashSet<>();
        while(head!=null)
        {
            if(nodeSeen.contains(head))
                return head;
            nodeSeen.add(head);
            head = head.next;
        }
        return null;
        
    }
}
