class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int inter = 0;
        for(int i=2; i<=n;i++){
            if(n%i == 0){
                inter = n/i;
                break;
            }
        }
        int a = 0;
        result.add(1);
        for(int j=2; j<=inter; j++){
            if(n%j == 0){
                result.add(j);
            }
        }

        result.add(n);
        Collections.sort(result);

        if(k > result.size()) return -1;

        return result.get(k-1);
    }
}
