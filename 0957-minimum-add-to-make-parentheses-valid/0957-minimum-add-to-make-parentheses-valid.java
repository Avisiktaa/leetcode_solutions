class Solution {
    public int minAddToMakeValid(String s) {
        int open=0,close=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                open++;
            }
            else
            {
                if(open<=0)
                close++;
                else
                open--;
            }
        }
        return open+close;       
    }
}