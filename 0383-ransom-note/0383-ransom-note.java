class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      int[] freq1=new int[26];

      int n=magazine.length();
      int m=ransomNote.length();

      for(int i=0;i<n;i++)
      {
        char ch=magazine.charAt(i);
        freq1[ch-'a']++;
      }  
      for(int i=0;i<m;i++)
      {
        char ch=ransomNote.charAt(i);
        freq1[ch-'a']--;
      }
      for(int i=0;i<26;i++)
      {
        if(freq1[i]<0)
        return false;
      }
      return true;
    }
}