class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;

        // Travel through each odd length
        for (int currentLength = 1; currentLength <= arr.length; currentLength += 2) {

            // Travel through each subArray with length = currentLength
            for (int startIndex = 0; startIndex + currentLength <= arr.length; ++startIndex) {

                // Travel through each element in subArray
                for (int index = startIndex; index < startIndex + currentLength; ++index) {
                    
                    // Sum element
                    sum += arr[index];
                }

            }
        }

        return sum;
        
    }
}
