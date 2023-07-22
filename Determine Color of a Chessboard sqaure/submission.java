class Solution {
    public boolean squareIsWhite(String coordinates) {
        int num1 = coordinates.charAt(0) - 'a';
        int num2 = coordinates.charAt(1) - '0';

        if(num1%2 == 0 && num2%2 == 1){
            return false;
        }
        else if(num1%2 == 1 && num2%2 == 1){
            return true;
        }
        else if(num1%2 == 0 && num2%2 ==0){
            return true;
        }
        return false;
    }
}
