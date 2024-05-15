class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        Queue<Integer> before = new LinkedList<>();
        Queue<Integer> equal = new LinkedList<>();
        Queue<Integer> after = new LinkedList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] < pivot){
                before.add(nums[i]);
            }else if(nums[i] == pivot){
                equal.add(nums[i]);
            }else{
                after.add(nums[i]);
            }
        }

        int[] res = new int[nums.length];
        int start = 0;

        for(int element:before){
            res[start++] = element;
        }
        
        for(int element:equal){
            res[start++] = element;
        }

        for(int element:after){
            res[start++] = element;
        }

        return res;
    }
}
