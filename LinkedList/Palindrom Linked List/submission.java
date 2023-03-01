class Solution {
    public boolean isPalindrome(ListNode head) {
     List<Integer> solution = new ArrayList<Integer>();

     ListNode current = head;

     while(current != null){
         solution.add(current.val);
         current = current.next;
     }

     int front = 0;
     int back = solution.size() -1;

     while(front<back){
         if(!solution.get(front).equals(solution.get(back))){
             return false;
         }

         front++;
         back--;
     }

     return true;
        
    }
}
