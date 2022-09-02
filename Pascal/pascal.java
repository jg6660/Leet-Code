class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>(numRows);
        pascal.add(new ArrayList<>());
        pascal.get(0).add(1);
        
        for(int i=1;i<numRows;i++)
        {
            List<Integer> row = new ArrayList<>();
            List<Integer> prev_row = pascal.get(i-1);
            row.add(1);
            for(int j=1;j<i;j++)
            {
                row.add(prev_row.get(j-1) + prev_row.get(j));
            }
            row.add(1);
            
            pascal.add(row);
        }
        
        return pascal;
    }
}
