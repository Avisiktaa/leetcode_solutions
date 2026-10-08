class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int x=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                if(x>0)
                {
                    sb.append('(');
                }
                x++;
            }
            else
            {
                x--;
                if(x>0)
                {
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }
}