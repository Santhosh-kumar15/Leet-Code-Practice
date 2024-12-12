class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
        }
        int n = nums.length;
        n = n / 2;      
        for(Map.Entry<Integer, Integer> entry: frequency.entrySet())
        {
           if(entry.getValue() > n)
                return entry.getKey();
        }
        return 0;
    }
}