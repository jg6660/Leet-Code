class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dup = new HashSet<>();
        for(int i:nums)
        {
            if(dup.contains(i))
                return true;
            else
                dup.add(i);
        }
        return false;
    }
}
