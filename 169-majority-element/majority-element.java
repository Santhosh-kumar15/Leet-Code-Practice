class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        int maxElement = -1;
        for(Map.Entry<Integer, Integer> entry: frequency.entrySet())
        {
            if(max < entry.getValue())
            {
                max = entry.getValue();
                maxElement = entry.getKey();
            }
        }
        return maxElement;
    }
}