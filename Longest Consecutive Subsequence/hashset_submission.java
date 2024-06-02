class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> store = new HashSet<>();

        for(int num: nums){
            store.add(num);
        }

        int longStreak = 0;

        for(int num: store){
            if(!store.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                while(store.contains(currentNum+1)){
                    currentStreak += 1;
                    currentNum += 1;
                }
                longStreak = Math.max(longStreak, currentStreak);
            }
        }

        return longStreak;
    }
}
