class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        if(mat.length%2==1)
        {
            for(int i=0;i<mat.length;i++)
            {
                sum = sum+mat[i][i]+mat[i][mat.length-i-1];
                System.out.println(sum);
            }
            sum=sum-mat[mat.length/2][mat.length/2];
        }
        else
        {
            for(int i=0;i<mat.length;i++)
            {
                sum = sum+mat[i][i]+mat[i][mat.length-i-1];
            }
        }
        return sum;
    }
}
