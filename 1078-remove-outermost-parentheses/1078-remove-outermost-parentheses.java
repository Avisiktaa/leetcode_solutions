class Solution {
    public String removeOuterParentheses(String s) {
       int x=0;
       StringBuilder sb=new StringBuilder("");
       int n=s.length();
       for(int i=0;i<n;i++)
       {
        char ch=s.charAt(i);
        if(ch=='(')
        {   
            if(x>0){
                sb.append(ch);
            }
            x++;
        }
        else{
            x--;
            if(x>0)
            {
                sb.append(ch);
            }
        }
       }
       return sb.toString();
    }
}