class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;

        boolean[][] visited=new boolean[m][n];
        boolean result=false;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    result=backtrack(board,word,visited,i,j,0);
                    if(result==true)
                    return true;
                }
            }
        }
        return false;
    }
    public boolean backtrack(char[][] board,String word, boolean[][] visited,int i, int j, int id)
    {
        if(id==word.length())
        return true;

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || visited[i][j] || board[i][j]!=word.charAt(id))
        return false;

        visited[i][j]=true;

        if(backtrack(board,word,visited,i+1,j,id+1) ||
           backtrack(board,word,visited,i-1,j,id+1) ||
           backtrack(board,word,visited,i,j+1,id+1) ||
           backtrack(board,word,visited,i,j-1,id+1))
           return true;

           visited[i][j]=false;
           return false;
    }
}