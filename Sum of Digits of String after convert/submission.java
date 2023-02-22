class Solution {

    public int sum(int n){
        int result = 0;
        while(n>0){
            result+= n%10;
            n=n/10;
        }
        return result;
    }

    public int getLucky(String s, int k) {
        List<Integer> Solution = new ArrayList<Integer>();

        for(int i =0;i<s.length();i++)
        {
            int num = s.charAt(i)-'a'+1;
            if(num>=1 && num<=9)
                Solution.add(num);
            else{
                Solution.add(num%10);
                Solution.add(num/10);
            }    
        }

        int sum1 =0;
        int sum2 =0;
        for(int i: Solution){
            sum1 += i;
        }

        if(k==1)
            return sum1;

        k = k-1;

        while(k>0)
        {
            sum2 = sum(sum1);
            sum1 = sum2;
            k--;
        }
        return sum1;
    }
}
