class Solution {
    public String intToRoman(int num) {
        int[] intCode = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] code = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        int i = 0;
        while(num > 0)
        {
            if(num >= intCode[i])
            {
                result.append(code[i]);
                num -= intCode[i];
            }
            else
            {
                i++;
            }
        }
        return result.toString();
    }
}