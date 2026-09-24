class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        int top=0,bottom=n-1;
        int left=0,right=m-1;
        List<Integer> res=new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            for(int j=left;j<=right;j++)
            {
                res.add(matrix[top][j]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                res.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            {
            for(int j=right;j>=left;j--)
            {
                res.add(matrix[bottom][j]);
            }
            bottom--;
            }
            if(left<=right)
            {
            for(int i=bottom;i>=top;i--)
            {
                res.add(matrix[i][left]);
            }
            left++;
            }
        }
        return res;
    }
}