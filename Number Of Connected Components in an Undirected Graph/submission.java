class Solution {
    public int countComponents(int n, int[][] edges) {
                        
        UnionFind uf = new UnionFind(n);
        
        for(int[] edge: edges){
            int A = edge[0];
            int B = edge[1];
            uf.union(A,B);
        }

        return uf.findCount();
        
    }
    
    class UnionFind{
        int[] root;
        int[] rank;
        int count;
        
        UnionFind(int size){
            root = new int[size];
            rank = new int[size];
            count = size;
            
            for(int i=0;i<size;i++){
                root[i] = i;
                rank[i] = 1;
            }
        }
        
        int find(int x){
            if(x == root[x]){
                return x;
            }
            
            return root[x] = find(root[x]);
        }
        
        void union(int x, int y){
            int rootX = find(x);
            int rootY = find(y);

            if(rootX != rootY){
                if(rank[rootX] > rank[rootY]){
                    root[rootY] = rootX;
                }else if(rank[rootX] < rank[rootY]){
                    root[rootX] = rootY;
                }else {
                    root[rootY] = rootX;
                    rank[rootX]+=1;
                } 
                count--;
            }
        }

        int findCount(){
            return count;
        }
    } 
}
