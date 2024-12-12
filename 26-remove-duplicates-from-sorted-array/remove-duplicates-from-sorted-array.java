class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> uniqueArray = new LinkedHashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            uniqueArray.add(nums[i]);
        }
        // int index = 0;
        // for(int num: uniqueArray)
        // {
        //     nums[index++] = uniqueArray.get(num);
        // }
        List<Integer> arrays = new LinkedList<>(uniqueArray);
        int index = 0;
        for(int i = 0; i < arrays.size(); i++)
        {
            nums[index++] = arrays.get(i);
        }
       return index;
    }
}