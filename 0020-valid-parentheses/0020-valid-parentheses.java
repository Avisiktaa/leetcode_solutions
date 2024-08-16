class Solution {
    public boolean isValid(String s) {
    Stack<Character> st=new Stack<>();
    int n=s.length();
    for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(ch=='(' || ch=='{' || ch=='[')
        st.push(ch);
        else if(ch==')' || ch=='}' || ch==']')
        {
            if(st.size()==0)
            return false;
            else if(ch==')' && st.peek()=='(')
            st.pop();
            else if(ch=='}' && st.peek()=='{')
            st.pop();
            else if(ch==']' && st.peek()=='[')
            st.pop();
            else 
            return false;
             
        }
       
    }
    if(st.size()>0)
    return false;
    return true;    
    }
}