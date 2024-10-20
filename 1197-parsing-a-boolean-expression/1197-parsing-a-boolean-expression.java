class Solution {
    public boolean parseBoolExpr(String expression) {
     Stack <Character> st= new Stack<>();
     for(char c : expression.toCharArray())
     {
        if(c=='('||c==',')
        continue;
        else if(c=='!'||c=='|'||c=='&'||c=='f'||c=='t')
        st.push(c);
        else if(c==')')
        {
            boolean istrue=false,isfalse=true;
            while(st.peek()!='|' && st.peek()!='&' && st.peek()!='!')
            {
                char curr=st.pop();
                if(curr=='t')
                istrue=true;
                else if(curr=='f')
                isfalse=false;

            }
            char op=st.pop();
            if(op=='&' )
            {
                if(isfalse==false)
                st.push('f');
                else
                st.push('t');
            }
            else if(op=='!')
            {
                if(istrue==true)
                st.push('f');
                else
                st.push('t');
            }
            else
            {
                if(istrue==true)
                st.push('t');
                else
                st.push('f');
            }

        }
     } 
     if (st.peek()=='t')
     return true;
     return false;  
    }
}