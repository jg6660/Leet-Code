class Solution {
    public int target;
    public int[][] graph;
    public List<List<Integer>> result;
    
    public void backtrack(int currNode, LinkedList<Integer> path){
        if(currNode == target){
            result.add(new ArrayList<Integer>(path));
            return;
        }

        for(int nextNode : graph[currNode]){
            path.addLast(nextNode);
            backtrack(nextNode,path);
            path.removeLast();
        }

    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        target = graph.length - 1;
        this.graph = graph;
        result = new ArrayList<List<Integer>>();

        LinkedList<Integer> path = new LinkedList<Integer>();
        path.addLast(0);
        backtrack(0,path);

        return result;
    }
}
