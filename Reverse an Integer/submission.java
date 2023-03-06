class Solution {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        Boolean result;
        long final_result;
        if(x == 0) { return 0;}
        else{
            if(x>0){ result = true;}
            else{
                result = false;
                x = x*-1;
            }
            System.out.println(x);
            while(x>0){
                int num = x%10;
                sb.append(num);
                x = x/10;
            }
            System.out.println(sb.toString());
            final_result = Long.parseLong(sb.toString());
            final_result = final_result/10;
            if( final_result >Integer.MAX_VALUE || final_result < Integer.MIN_VALUE) return 0;
            if(result == true) {return (int)final_result;}
            else {
                final_result*=-1;
                return (int)final_result;
            }
        }
        
        
    }
}
