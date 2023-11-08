class Solution {
    public int earliestAcq(int[][] logs, int n) {
        Arrays.sort(logs, new Comparator<int[]>() {
            @Override
            public int compare(int[] log1, int[] log2) {
                Integer tsp1 = new Integer(log1[0]);
                Integer tsp2 = new Integer(log2[0]);
                return tsp1.compareTo(tsp2);
            }
        }); 
        
        UnionFind uf = new UnionFind(n);
        
        for(int[] log: logs){
            int timeStamp = log[0];
            int X = log[1];
            int Y = log[2];
            uf.Union(X,Y);
            if(uf.count() == 1){
                return timeStamp;
            }
        }
        
        return -1;
    }
}

class UnionFind{
    int root[];
    int rank[];
    int connectedComp;
    
    UnionFind(int n){
        root = new int[n];
        rank = new int[n];
        connectedComp = n;
        
        for(int i=0; i<n;i++){
            root[i] = i;
            rank[i] = i;
        }
    }
    
    int find(int x){
        if(x == root[x]){
            return x;
        }
        
        return root[x] = find(root[x]);
    }
    
    void Union(int x, int y){
        int rootX = find(x);
        int rootY = find(y);
        
        if(rootX != rootY){
            if(rank[rootX] > rank[rootY]){
                root[rootY] = rootX;
            }
            else if(rank[rootY] > rank[rootX]){
                root[rootX] = rootY;
            }
            else{
                root[rootY] = rootX;
                rank[rootX] +=1;
            }
            
            connectedComp --;
        }
    }
    
    int count(){
        return connectedComp;
    }
}
