class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> nums = new Stack<Character>();

        if (k >= num.length()) {
            return "0";
        }

        for (int i = 0; i < num.length(); i++) {
            char currentDigit = num.charAt(i);

            // Remove digits from the stack as long as k is greater than 0 and the current digit
            // is less than the digit at the top of the stack
            while (!nums.isEmpty() && k > 0 && nums.peek() > currentDigit) {
                nums.pop();
                k--;
            }

            nums.push(currentDigit);
        }

        // If there are still remaining digits to be removed, remove them from the end of the stack
        while (k > 0 && !nums.isEmpty()) {
            nums.pop();
            k--;
        }

        // Build the result string from the stack
        StringBuilder sb = new StringBuilder();
        while (!nums.isEmpty()) {
            sb.append(nums.pop());
        }
        sb.reverse();

        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
