class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        int n = words.length;
        String word = words[n - 1];
        int wordLength = word.length();
        return wordLength;

    }
}