class Solution {
    
    public int lengthDigit(int num){
        int length = 0;
        while(num>0){
            length += 1;
            num /=10;
        }
        
        return length;
    }
    
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums){
            int length = lengthDigit(num);
            if(length%2 == 0){
                count++;
            }
        }
        
        return count;
    }
}
