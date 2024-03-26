class Solution {
    public int pivotInteger(int n) {
        int sum = n*(n+1)/2;
        int leftSum = 0;
        for(int i=1; i<=n; i++){
           leftSum += i;
           
        }

        return -1;
    }
}

// for(int i=1; i<=n; i++){
//             int leftSum = 0;
//             int rightSum = 0;
//             for(int j=1; j<=i; j++){
//                 leftSum += j;
//             }

//             for(int k=i; k<=n; k++){
//                 rightSum += k;
//             }
//             if(leftSum == rightSum) return i;
//             leftSum = 0;
//             rightSum = 0;
//         }

//         return -1;
