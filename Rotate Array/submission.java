class Solution {
    public void rotate(int[] nums, int k) {
        int temp;
        int[] nums_clone = new int[nums.length];
        for(int rotations=0; rotations<k ;rotations++){
            int last = nums.length -1;
            temp = nums[last];
            nums_clone = nums.clone();
            System.out.println(Arrays.toString(nums_clone));
            for(int i=0;i< nums.length -1 ;i++){
                nums[i+1] = nums_clone[i];
            }
            nums[0] = temp;
            System.out.println(Arrays.toString(nums));
        }
        
    }
}
