class Solution {
    public boolean checkValid(int[][] matrix) {
        int size = matrix[0].length;

        HashSet<Integer>[] rows = new HashSet[size];
        HashSet<Integer>[] cols = new HashSet[size];

        for(int i=0; i<size; i++){
            rows[i] = new HashSet<Integer>();
            cols[i] = new HashSet<Integer>();
        }

        for(int r=0; r<size; r++){
            for(int c=0; c<size; c++){
                int val = matrix[r][c];

                if(rows[r].contains(val)){
                    return false;
                }
                rows[r].add(val);

                if(cols[c].contains(val)){
                    return false;
                }
                cols[c].add(val);
            }
        }

        return true;
    }
}
