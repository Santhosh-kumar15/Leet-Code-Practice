class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;

        while(top <= bottom && left<= right)
        {
            //move to right
            for(int i = left; i <= right; i++)
            {
                result.add(matrix[top][i]);
            }
            top++;
            // move to bottom
            for(int i = top; i <= bottom; i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            
            if(top <= bottom)
            {
                // move to left
                for(int i = right; i >= left; i--)
                {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right)
            {
                // move to top
                for(int i = bottom; i >= top; i--)
                {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}