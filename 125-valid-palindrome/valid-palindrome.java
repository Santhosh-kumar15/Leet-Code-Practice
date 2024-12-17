class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while(start <= end)
        {
            char cf = s.charAt(start);
            char cl = s.charAt(end);

            if(!Character.isLetterOrDigit(cf))
                start++;
            else if(!Character.isLetterOrDigit(cl))
                end--;
            else
            {
                if(cf != cl)
                    return false;
                start++;
                end--;
            }
        }
        return true;
    }
}