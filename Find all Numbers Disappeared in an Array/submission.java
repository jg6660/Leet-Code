class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();

        Set<Integer> temp = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            temp.add(nums[i]);
        }

        for(int i=1;i<=nums.length;i++){
            if(!temp.contains(i)){
               result.add(i);     
            }
        }

        return result;
    }
}
