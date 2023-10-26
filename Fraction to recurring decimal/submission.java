class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0){
            return "0";
        }

        StringBuilder res = new StringBuilder();

        // To append negative sign if one of them is negative
        if(numerator<0 ^ denominator<0){
            res.append("-");
        }

        long dividend = Math.abs((long)numerator);
        long divisor = Math.abs((long)denominator);

        long quotient = dividend/divisor;
        long remainder = dividend%divisor;

        res.append(String.valueOf(quotient));

        if(remainder == 0){
            return res.toString();
        }

        res.append(".");
        HashMap<Long, Integer> store = new HashMap<>();

        while(remainder != 0){
            if(store.containsKey(remainder)){
                res.insert(store.get(remainder), "(");
                res.append(")");
                break;
            }

            store.put(remainder, res.length());
            remainder *= 10;
            res.append(String.valueOf(remainder/divisor));
            remainder %= divisor;
        }

        return res.toString();
}
}
