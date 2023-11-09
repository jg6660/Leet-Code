class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        boolean[] seen = new boolean[n];

        for(int[] edge: edges){
            int a = edge[0], b = edge[1];
            graph.computeIfAbsent(a,val -> new ArrayList<Integer>()).add(b);
            graph.computeIfAbsent(b,val -> new ArrayList<Integer>()).add(a);
        }

        LinkedList<Integer> queue = new LinkedList<Integer>();
        seen[source] = true;
        queue.offer(source);

        while(!queue.isEmpty()){
            int currNode = queue.poll();
            if(currNode == destination){
                return true;
            }

            for(int neighbor : graph.get(currNode)){
                if(!seen[neighbor]){
                    seen[neighbor] = true;
                    queue.offer(neighbor);
                }
            }

        }
        return false;
    }
}
