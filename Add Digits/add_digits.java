class Solution {
    public int addDigits(int num) {
        int sum = 0;
        int i;
        while(num!=0)
        {
            i = num%10;
            sum+=i;
            num=num/10;
        }
        if(sum/10==0)
            return sum;
        else
            return addDigits(sum);
    }
}


// O(1) solution

class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }
}
