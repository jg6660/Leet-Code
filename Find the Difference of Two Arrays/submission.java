class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
     List<List<Integer>> result = new ArrayList<List<Integer>>();
     int count1 = 0;
     List row1 = new ArrayList<Integer>();
     for(int i=0 ;i<nums1.length; i++){
         for(int j=0; j<nums2.length; j++){
             if(nums1[i] == nums2[j]){
                 count1 = 1;
             }
         }
         if(count1 == 0 && !row1.contains(nums1[i])){
             row1.add(nums1[i]);
         }
         count1 = 0;
       }

    result.add(row1);

    int count2  = 0;

    List row2 = new ArrayList<Integer>();

    for(int i=0 ; i<nums2.length; i++){
        for(int j=0; j<nums1.length; j++){
            if(nums2[i] == nums1[j]){
                count2 = 1;
            }
        }

        if(count2 == 0 && !row2.contains(nums2[i])){
            row2.add(nums2[i]);
        }
        count2 = 0;
    }

    result.add(row2);

    return result;   

    }
}
