class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> result = new HashSet<Integer>();
        for(int i=0; i<nums1.length; i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    result.add(nums1[i]);
                }
            }
        }

        int[] result1 = new int[result.size()];
        int i=0;
        for(int value:result){
            result1[i++] = value;
        }

        return result1;
    }
}
