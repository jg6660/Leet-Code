class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        List<int[]> edges = new ArrayList<>();
        for(int currPoint=0; currPoint<n; currPoint++){
            for(int nextPoint = currPoint+1; nextPoint<n; nextPoint++){
                int weight = Math.abs(points[nextPoint][1] - points[currPoint][1]) + Math.abs(points[nextPoint][0] - points[currPoint][0]);
                edges.add(new int[]{weight, currPoint, nextPoint});
            }
        }

        Collections.sort(edges, (a,b) -> Integer.compare(a[0],b[0]));

        int mstCost = 0;
        int edgesUsed = 0;
        UnionFind uf = new UnionFind(n);

        for(int i=0; i<edges.size() && edgesUsed<n-1; i++){
            int node1 = edges.get(i)[1];
            int node2 = edges.get(i)[2];
            if(uf.union(node1, node2)){
                mstCost += edges.get(i)[0];
                edgesUsed++;
            }
        }


        return mstCost;    
    }
}

class UnionFind {
    public int[] rootParent;
    public int[] rank;

    UnionFind(int n){
        rootParent = new int[n];
        rank = new int[n];
        for(int i=0; i<n; i++){
            rootParent[i] = i;
        }
    }

    public int find(int n){
        if(n == rootParent[n]){
            return n;
        }

        return rootParent[n] = find(rootParent[n]);
    }

    public boolean union(int a, int b){
        int rootA = find(a);
        int rootB = find(b);

        if(rootA == rootB ){
            return false;
        }

        if(rootA != rootB){
            if(rank[rootA]> rank[rootB]){
                rootParent[rootB] = rootA;
            }
            else if(rank[rootB] > rank[rootA]){
                rootParent[rootA] = rootB;
            }
            else{
                rootParent[rootB] = rootA;
                rank[rootA] += 1;
            }
        }

        return true;
    }
}
