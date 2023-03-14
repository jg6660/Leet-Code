class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }

        HashMap<Integer,Integer> result = new HashMap<Integer, Integer>();

        for(int i: nums2){
            result.put(i, result.getOrDefault(i,0) +1);
        }
        int k = 0;
        for(int j:nums1){
            int count = result.getOrDefault(j,0);
            if(count>0){
                nums1[k++] = j;
                result.put(j, count -1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}
