class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstOccurrence = this.findBound(nums, target, true);
        if(firstOccurrence == -1){
            return new int[]{-1,-1};
        }

        int lastOccurrence = this.findBound(nums,target,false);

        return new int[]{firstOccurrence, lastOccurrence};
    }

    private int findBound(int[] nums, int target, boolean isFirst){
        int begin = 0, end = nums.length-1;

        while(begin <= end){
            int middle = begin + (end - begin)/2;

            if(nums[middle] == target){
                if(isFirst){
                    if(middle == begin || nums[middle-1] != target){
                        return middle;
                    }
                    end = middle - 1;
                }
                else {
                    if(middle == end || nums[middle+1] != target){
                        return middle;
                    }
                    begin = middle + 1;
                }
            }
            else if(nums[middle] > target){
                end = middle - 1;
            }
            else{
                begin = middle +1;
            }
        }

        return -1;
    }
}
