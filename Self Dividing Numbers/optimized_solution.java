class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> toReturn = new LinkedList<Integer>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                toReturn.add(i);
            }
        }
        
        return toReturn;
    }
    
    private boolean isSelfDividing(int n) {
        int cur = n;
        while (cur != 0) {
            int digit = cur % 10;
            if (digit == 0 || n % digit != 0) {
                return false;
            }
            cur /= 10;
        }
        
        return true;
    }
}
