class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        long sum;
        int n = nums.length;
        for(int i=0;i<n-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            for(int j=i+1;j<n-2;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1])
                    continue;
                int left = j+1;
                int right = n-1;
                while(left<right)
                {
                    sum = (long) nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target)
                    {
                        ArrayList<Integer> pairs = new ArrayList();
                        pairs.add(nums[i]);
                        pairs.add(nums[j]);
                        pairs.add(nums[left]);
                        pairs.add(nums[right]);
                        Collections.sort(pairs);
                        result.add(pairs);
                        left++;
                        right--;
                        while(left<right && nums[right]==nums[right+1])
                            right--;
                        while(left<right && nums[left]==nums[left-1])
                            left++;
                    }
                    else if(sum>target)
                        right--;
                    else 
                        left++;
                }
            }
        }
        return result;
    }
}