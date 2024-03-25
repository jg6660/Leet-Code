class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     HashSet<Integer> values = new HashSet<>();
     HashSet<Integer> result = new HashSet<>();
     for(int num:nums){
        if(values.contains(num)){
            result.add(num);
        }
        values.add(num);
     }

     List<Integer> results = new ArrayList<>(result);
     return results;
    }
}
