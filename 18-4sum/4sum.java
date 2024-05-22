class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        long sum;
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=0;i<len-3;i++)
        {
            if(i>0 && nums[i] == nums[i-1])
                continue;
            for(int j=i+1;j<len-2;j++)
            {
                if(j>i+1 && nums[j] == nums[j-1])
                    continue;
                int left = j+1;
                int right = len-1;
                while(left<right)
                {
                    sum =(long) nums[left] + nums[right] + nums[j] + nums[i];
                    if(sum == target)
                    {
                        ArrayList<Integer> pairs = new ArrayList<>();
                        pairs.add(nums[i]);
                        pairs.add(nums[j]);
                        pairs.add(nums[left]);
                        pairs.add(nums[right]);
                        Collections.sort(pairs);
                        result.add(pairs);
                        left++;
                        right--;

                        while(left<right && nums[right] == nums[right+1])
                        {
                            right--;
                        }

                        while(left<right && nums[left] == nums[left-1])
                        {
                            left++;
                        }
                    }
                    else if(sum<target)
                    {
                        left++;
                    }
                    else
                    {
                        right--;
                    }

                }
            }
            
        }
        return result;
    }
}