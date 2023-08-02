class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length;k++){
                    if(nums[i] + nums[j]+nums[k] < target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        System.out.println(result);
        return result.size();
    }
}
