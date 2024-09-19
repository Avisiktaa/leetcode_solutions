class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<expression.length();i++)
        {
            char op=expression.charAt(i);
            if(op=='+'||op=='-'||op=='*')
            {
                List<Integer> left=diffWaysToCompute(expression.substring(0,i));
                List<Integer> right=diffWaysToCompute(expression.substring(i+1));
                for(int a:left)
                {
                    for(int b:right)
                    {
                        if(op=='+')  ans.add(a+b);
                        else if(op=='-')  ans.add(a-b);
                        else if(op=='*')  ans.add(a*b);

                    }
                }
            }
            }
            if(ans.isEmpty())  ans.add(Integer.parseInt(expression));
            return ans;
        }
    }
