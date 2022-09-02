/* To access specific row in pascal triangle. Try to access specific row by just creating 2 arraylist of 1-d type. Need to work on this part */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal_row = new ArrayList<List<Integer>>(rowIndex);
        
        pascal_row.add(new ArrayList());
        pascal_row.get(0).add(1);
        
        for(int i=1;i<rowIndex+1;i++)
        {
            List<Integer> row = new ArrayList();
            List<Integer> prev_row = pascal_row.get(i-1);
            
            row.add(1);
            for(int j=1;j<i;j++)
                row.add(prev_row.get(j-1)+prev_row.get(j));
            row.add(1);
            pascal_row.add(row);
        }
        return pascal_row.get(rowIndex);
        
    }
}

/* Additional Resource -> https://leetcode.com/problems/pascals-triangle-ii/ */
