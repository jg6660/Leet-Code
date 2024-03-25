class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> values = new HashSet<>();

        for(int num : nums){
            if(values.contains(num)){
                return num;
            }
            else{
                values.add(num);
            }
        }

        return -1;
    }
}
