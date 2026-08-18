class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        return 0;
        int[] freq=new int[256];
        Arrays.fill(freq,0);
        int maxlen=-1;
        int left=0;
        int right=0;
        while(right<s.length())
        {   Character ch=s.charAt(right);
            while(freq[ch]>0)
            {
                freq[s.charAt(left)]--;
                left++;
            }
            freq[ch]++;
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}