class Solution {

    public boolean dividing_number(int n){
        int temp = n;
        int count = 0;
        int count1 = 0;
        while(n>0){
            int k = n%10;
            if(k==0) return false;
            if (temp%k ==0)
                count++;
            n = n/10;
            count1++;    
        }
        if(count == count1) return true;
        else return false;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> solution = new ArrayList<Integer>();

        for(int i =left; i<=right; i++){
            if(dividing_number(i))
                solution.add(i);
        }
        return solution;

    }
}
