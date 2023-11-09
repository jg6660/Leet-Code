class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        PriorityQueue<Pair<Integer, Integer>> heap = new PriorityQueue<>((a,b) -> (a.getKey() - b.getKey()));

        int minMST = 0;
        int edgesUsed = 0;
        boolean[] visited = new boolean[n];

        heap.add(new Pair(0,0));

        while(edgesUsed<n){
            Pair<Integer, Integer> topElement = heap.poll();    
            int edgeWeight = topElement.getKey();
            int node = topElement.getValue();

            if(visited[node]){
                continue;
            }

            visited[node] = true;    
            minMST += edgeWeight;
            edgesUsed++;

            for(int nextNode=0; nextNode<n; nextNode++){
                if(!visited[nextNode]){
                    int weight = Math.abs(points[nextNode][1] -  points[node][1]) + Math.abs(points[nextNode][0] - points[node][0]);
                    heap.add(new Pair(weight, nextNode));
                }
            }

        }

        return minMST;  
    }
}

