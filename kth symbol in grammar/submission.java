class Solution {
    public int kthGrammar(int n, int k) {
        List<List<Integer>> symbol_row = new ArrayList<List<Integer>>(n);
        
        symbol_row.add(new ArrayList());
        symbol_row.get(0).add(0);
        
        for(int i=1;i<n;i++){
            List<Integer> row = new ArrayList();
            List<Integer> prev_row = symbol_row.get(i-1);
            System.out.println(prev_row);
            for(int j=0;j<prev_row.size();j++){
                if(prev_row.get(j) == 0){
                    row.add(0);
                    row.add(1);
                }else{
                    row.add(1);
                    row.add(0);
                }
                System.out.println(row);
            }
            symbol_row.add(row);
        }
        return symbol_row.get(n-1).get(k-1);
        
    }
}
