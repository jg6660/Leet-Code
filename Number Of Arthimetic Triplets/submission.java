class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
     List<List<Integer>> result = new ArrayList<List<Integer>>();
     
     for(int i=0;i<nums.length;i++){
         for(int j=i+1;j<nums.length;j++){
             for(int k=j+1;k<nums.length;k++){
                 if(nums[j]-nums[i]==diff && nums[k]-nums[j] == diff){
                     result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                 }
             }
         }
     }

     return result.size();
    }
}
