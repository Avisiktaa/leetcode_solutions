class Solution {
    public void rotate(int[][] matrix) {
      int i=0,j=0,n=matrix.length;
      for(i=0;i<n;i++){
        for(j=i;j<n;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
      }  
      for(i=0;i<n;i++){
        for(j=0;j<n/2;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[i][matrix.length-1-j];
            matrix[i][matrix.length-1-j]=temp;
        }
      }
    }
    }
