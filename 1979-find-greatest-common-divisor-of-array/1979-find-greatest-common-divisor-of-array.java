class Solution {
    public int findGCD(int[] nums) {
        int mini=Arrays.stream(nums).min().getAsInt();
        int maxi=Arrays.stream(nums).max().getAsInt();
        while(mini>0)
        {
            int rem=maxi%mini;
            maxi=mini;
            mini=rem;
        }
        return maxi;
    }
}