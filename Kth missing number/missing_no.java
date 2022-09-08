class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num=1;
        int i=0;
        while(k>0)
        {   
            if(i<arr.length)
            {
            if(num!=arr[i])
            {
                System.out.println("Missing ="+num);
                k--;
            }
            else
            {
                System.out.println("Matching ="+num);
                i++;
            }
            }
            else
            {
                k--;
            }
            num++;
        }
        System.out.println(num);
        return num-1;
    }
}
