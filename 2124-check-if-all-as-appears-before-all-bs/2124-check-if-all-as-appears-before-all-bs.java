class Solution {
    public boolean checkString(String s) {
        int n=s.length(),id=-1;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='b')
            {
                id=i;
                break;
            }
        }
        if(id==-1 || id==n-1)
        return true;

        for(int i=id+1;i<n;i++)
        {
            if(s.charAt(i)=='a')
            return false;
        }
        return true;
    }
}