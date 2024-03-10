class Solution {
    public int countTriplets(int[] arr) {
        int count = 0;

        for(int i = 0; i < arr.length-1; i++)
            for(int j = i+1; j < arr.length; j++)
                for(int k = j; k < arr.length; k++){
                    int a = arr[i];
                    int b = arr[j];

                    for(int l = i+1; l < j; l++)
                        a = a^arr[l];

                    for(int l = j+1; l <= k; l++)
                        b = b^arr[l];

                    if(a == b)
                        count++;
                }

        return count;
    }
}
