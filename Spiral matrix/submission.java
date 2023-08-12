class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     List<Integer> result = new ArrayList<Integer>();

     int rows = matrix.length;
     int column = matrix[0].length;

     int top = 0;
     int left = 0;
     int bottom = rows - 1;
     int right = column -1;

     while(result.size() < rows*column){
         for(int col=left; col<=right; col++){
             result.add(matrix[top][col]);
         }

         for(int row=top+1; row<=bottom; row++){
             result.add(matrix[row][right]);
         }
        if(top != bottom){
         for(int col=right-1; col>=left; col--){
             result.add(matrix[bottom][col]);
         }   
        }
        if(left != right){
            for(int row=bottom-1; row>top; row--){
                result.add(matrix[row][left]);
            }
        }
        top++;
        left++;
        bottom--;
        right--;
     }   

     return result;
    }
}
