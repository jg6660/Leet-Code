class Solution {
    List<List<Integer>> result = new ArrayList();
    int n,k;

    public void backtrack(int start, ArrayList<Integer> curr, int[] nums){
        if(curr.size() == k){
            result.add(new ArrayList(curr));
            return;
        }

        for(int i=start; i<nums.length; ++i){
            curr.add(nums[i]);
            backtrack(i+1, curr, nums);
            curr.remove(curr.size() -1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        for(k=0; k<n+1; ++k){
            backtrack(0, new ArrayList<Integer>(), nums);
        }

        return result;
    }
}
