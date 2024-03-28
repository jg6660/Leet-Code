class Solution {
    public int getWinner(int[] arr, int k) {
        int maxElement = arr[0];
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<arr.length; i++){
            maxElement = Math.max(maxElement, arr[i]);
            queue.offer(arr[i]);
        }

        int current = arr[0];
        int winStreak = 0;

        while(!queue.isEmpty()){
            int opponent = queue.poll();

            if(current > opponent){
                queue.offer(opponent);
                winStreak++;
            }
            else{
                queue.offer(current);
                current = opponent;
                winStreak=1;
            }

            if(winStreak == k || current == maxElement){
                return current;
            }
        }

        return -1;
    }
}
