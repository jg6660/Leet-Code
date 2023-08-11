/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */

class Solution {
    public int search(ArrayReader reader, int target) {
        if(target == reader.get(0)) { return 0;}
        int left = 0, right = 1;
        while(reader.get(right) < target){
            left = right;
            right = right<<1;
        }
        while(left <= right){
            int middle = left + (right - left)/2;
            if(target == reader.get(middle)){
                return middle;
            }else if(target > reader.get(middle)){
                left = middle +1;
            }else{
                right = middle-1;
            }
        }

        return -1;
    }
}
