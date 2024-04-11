class Solution {
    public String removeDigit(String number, char digit) {
        long maximum = Long.MIN_VALUE;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String result;
                if (i == 0) {
                    result = number.substring(i + 1);
                } else if (i == number.length() - 1) {
                    result = number.substring(0, i);
                } else {
                    result = number.substring(0, i) + number.substring(i + 1);
                }
                long currentNumber = Long.parseLong(result);
                maximum = Math.max(maximum, currentNumber);
            }
        }

        return String.valueOf(maximum);
    }
}



// This solution wasn't working for really really long numbers
