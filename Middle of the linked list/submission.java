class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode next1 = head;
        ListNode next2 = head;
        int count = 0;
        if(head == null) return head;
        while(next1!=null){
            count++;
            next1 = next1.next;
        }

        for(int i=0;i<count/2;i++){
            next2 = next2.next;
        }

        if(count%2 != 0) return next2;
        else return next2;
    }
}
