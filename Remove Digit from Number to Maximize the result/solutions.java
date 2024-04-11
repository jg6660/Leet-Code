class Solution {

    //Approach 1 : takes 3ms and beats 26%
    // public String removeDigit(String number, char digit) {
        
    //   List<String> nums = new ArrayList<>();

    //   for(int i = 0 ; i <number.length();i++)
    //   {
    //     if(number.charAt(i)==digit)
    //         nums.add(number.substring(0,i)+number.substring(i+1));
    //   }

    //   Collections.sort(nums);
    //   return nums.get(nums.size()-1);
    // }


    public String removeDigit(String number, char digit) {
        int n = number.length();
        int j = 0 ;
        
        for(int i = 0 ;i<n;i++)
        {
            if(number.charAt(i)==digit)
            {
                j = i;
                if((i+1)<n && number.charAt(i+1)>digit)
                    break;
            }
        }

        return number.substring(0,j)+number.substring(j+1);
    }
}
