class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
       int len1=str1.length(),len2=str2.length();
        int i=0,j=0;
       if(len1<len2) return false;
        for(i=0;i<len1 && j<len2;i++)
        {
            if(str1.charAt(i)==str2.charAt(j) || 
            str2.charAt(j)-'a'== ((str1.charAt(i)-'a')+1)%26)

            j++;
        }
        return j==len2;
    }
}