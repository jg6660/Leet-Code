class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        reverse(capacity);
        int total_apples = 0;
        int count = 0;
        for(int i=0; i<apple.length; i++){
            total_apples += apple[i];
        }
        System.out.println(total_apples);
        int j =0 ;
        while(j<capacity.length){
            total_apples = total_apples - capacity[j];
            System.out.println(total_apples);
            count ++;
            System.out.println(count);
            if(total_apples <=0){
                break;
            }
            j++;
        }
        
        return count;
    }
    
     public static void reverse(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
}
