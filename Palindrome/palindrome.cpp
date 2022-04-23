class Solution {
public:
    bool isPalindrome(int x) {
        bool ans;
        string str = to_string(x);
        int count =0;
        if(x==0)
        {
            ans = true;
        }
        for(int i=0;i<str.length()/2;i++)
        {
            if(str[i]==str[str.length()-i-1])
            {
                ans = true;
            }
            else
            {
                ans = false;
                break;
            }
        }
        return ans;
    }
};
