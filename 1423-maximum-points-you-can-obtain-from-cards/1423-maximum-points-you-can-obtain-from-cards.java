class Solution {
    public int maxScore(int[] arr, int k) {
       int n=arr.length;
       int sum=0,maxi=0;
       for(int i=n-k;i<n;i++)
       {
        sum+=arr[i];
       } 
       int id=n-k;
       maxi=Math.max(maxi,sum);
       for(int i=0;i<k;i++)
       {
        sum-=arr[id++];
        sum+=arr[i];
        maxi=Math.max(maxi,sum);
       }
       return maxi;
    }
}