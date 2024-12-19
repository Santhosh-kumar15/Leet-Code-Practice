class Solution {
    public int lengthOfLongestSubstring(String s) {
        int strLength = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for(int right = 0; right < strLength; right++)
        {
            char currChar = s.charAt(right);
            if(!(charSet.contains(currChar)))
            {
                charSet.add(currChar);
                maxLength = Math.max(maxLength, right - left + 1);
            }
            else
            {
                while(charSet.contains(currChar))
                {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(currChar);
            }
        }
        return maxLength;
    }
}