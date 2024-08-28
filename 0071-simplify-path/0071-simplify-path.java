class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] name=path.split("/");

        for(String c : name)
        {
            if(c.equals("") || c.equals("."))
            {
                continue;
            }
            if(c.equals(".."))
            {
               if(!st.isEmpty())
               {
                st.pop();
               } 
            }
            else
            st.push(c);
        }
        if (st.isEmpty())
        {
            return "/";
        }
        StringBuilder sb=new StringBuilder();
        for(String ch:st)
        {
            sb.append("/").append(ch);
        }
        return sb.toString();
    }
}