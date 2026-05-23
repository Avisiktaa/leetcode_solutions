class Solution {
    public boolean areNumbersAscending(String s) {
        int n=s.length();
        int max=0;

        for(int i=0;i<n;i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int curr=0;
                while(i<n && Character.isDigit(s.charAt(i)))
                {
                    curr*=10;
                    curr+=s.charAt(i)-'0';
                    i++;
                }
                if(curr<=max)
                return false;

                max=curr;
            }
        }
        return true;
    }
}