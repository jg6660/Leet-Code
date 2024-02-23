class Solution {
    public int jump(int[] nums) {
        int curEnd=0, curFarthest=0, jumps=0;
        for(int i=0; i<nums.length-1; i++){
            curFarthest = Math.max(curFarthest, i+nums[i]);
            if(i==curEnd){
                jumps++;
                System.out.println(curEnd);
                curEnd = curFarthest;
                System.out.println(curEnd);
            }
        }

        return jumps;
    }
}
