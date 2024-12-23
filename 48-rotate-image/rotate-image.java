class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // matrix transpose
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                swap(matrix, i, j);
            }
        }

        // matrix reverse
        for(int i = 0; i < n; i++)
        {
            reverseRow(matrix[i]);
        }
    }

    public static void swap(int[][] matrix, int i, int j)
    {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      
    }
    
    public static void reverseRow(int[] row)
    {
        int left = 0;
        int right = row.length - 1;
        while(left < right)
        {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}