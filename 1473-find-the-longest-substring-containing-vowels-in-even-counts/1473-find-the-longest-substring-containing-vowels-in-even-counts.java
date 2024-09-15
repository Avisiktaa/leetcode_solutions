class Solution {
    public int findTheLongestSubstring(String s) {
        int []mapp=new int[32];
        Arrays.fill(mapp,-2);
        mapp[0]=-1;
        int mask=0;
        int len=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            switch(ch){
                case 'a':
                    mask^=1;
                    break;
                case 'e':
                mask^=2;
                break;
                case 'i':
                mask^=4;
                break;
                case 'o':
                mask^=8;
                break;
                case'u':
                mask^=16;
                break;
            }
            int pre=mapp[mask];
            if(pre==-2)
            mapp[mask]=i;
            else
            len=Math.max(len,i-pre);
        }
        return len;
    }
}