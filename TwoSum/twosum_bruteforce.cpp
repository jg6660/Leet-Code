class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> indices;
            for(int i=0;i<nums.size();i++)
            {
                for(int j=0;j<i;j++)
                {
                    if(nums[i]+nums[j]==target)
                    {
                        indices.push_back(j);
                        indices.push_back(i);
                    }
                }
            }
        return indices;
    }
};
