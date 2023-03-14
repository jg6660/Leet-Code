class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] result;
        if(length1 <= length2){
            result = new int[length1];
        }
        else{
            result = new int[length2];
        }
        int k=0;
        if(length1 < length2){
            int j=0;
            while(j<length1){
                for(int i=0; i<nums2.length; i++){
                    if(nums1[j] == nums2[i] && k<length1){
                        result[k] = nums1[j];
                        k++;
                        break;
                    }    
                }
                j++;
            }
        }
        else{
            int j=0;
            while(j<length2){
                for(int i=0; i<nums1.length; i++){
                    if(nums2[j] == nums1[i] && k<length2){
                        result[k] = nums2[j];
                        k++;
                        break;
                    }    
                }
                j++;
            }
        }
        int[] result1 = new int[k];
        for(int i=0; i<k;i++){
            result1[i] = result[i];
        }
        return result1;
    }
}
