class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
      long chemistry=0;
        int sum=0;
      int n=skill.length;
      int i=1,j=n-2;
      sum=skill[0]+skill[n-1];
      chemistry=skill[0]*skill[n-1];
      while(i<j)
      {
        if(skill[i]+skill[j]==sum)
        {
            chemistry+=(long)skill[i]*skill[j];
            i++;
            j--;
        }
        else
        return -1;
      }
      return chemistry;  
    }
}