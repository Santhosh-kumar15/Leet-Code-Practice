class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder ans = new StringBuilder();
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];

        int x = 0;
        int y = 0;

        while(x < s1.length() && y < s2.length())
        {
            if(s1.charAt(x) == s2.charAt(y))
            {
                ans.append(s1.charAt(x));
                x++;
                y++;
            }
            else
            {
                break;
            }
        }
        if(ans.length() <= 0)
            return "";
        return ans.toString();
    }
}