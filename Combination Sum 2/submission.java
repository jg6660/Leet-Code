class Solution {

    protected void backtrack(int remain, LinkedList<Integer> comb, int[] candidates, int start, List<List<Integer>> result){

        if(remain == 0){
            result.add(new ArrayList<Integer>(comb));
            return;
        }
        else if(remain < 0){
            return;
        }

        for(int i=start; i<candidates.length; i++){
            if(i > start && candidates[i] == candidates[i-1]) continue; // Key step of this problem
            comb.add(candidates[i]);
            this.backtrack(remain - candidates[i], comb, candidates, i+1, result);
            comb.removeLast();
        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        LinkedList<Integer> comb = new LinkedList<Integer>();
        Arrays.sort(candidates);
        this.backtrack(target, comb, candidates, 0, result);
        return result;
    }
}
