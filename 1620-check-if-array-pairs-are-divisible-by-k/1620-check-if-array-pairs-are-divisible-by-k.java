class Solution {
    public boolean canArrange(int[] arr, int k) {
       int[] freq=new int[k];
       for(int num:arr)
       {
        int rem=(num%k+k)%k;
        freq[rem]++;
       }
       if(freq[0]%2!=0) return false;
       for(int i=1;i<k;i++)
       {
        if(freq[i]!=freq[k-i])
        return false;
       }
       return true;
    }
}