class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
        String nums="123456789";
        int cnt=0,cpy=low,f=0;
        while(cpy>0)
        {
            cnt++;
            cpy/=10;
        }
        int count=cnt;
        String subs=nums.substring(f,cnt);
        int beg=Integer.parseInt(subs);
        while(beg<low)
        {
            cnt++;
            if(cnt>nums.length())
            {
                cnt=++count;
                f=-1;
                if(count>nums.length()) break;
            }
            subs=nums.substring(++f,cnt);
            beg=Integer.parseInt(subs);
        }
        while(beg>=low && beg<=high)
        {
            list.add(beg);
            cnt++;
            if(cnt>nums.length())
            {
                cnt=++count;
                f=-1;
                if(count>nums.length()) break;
            }
            subs=nums.substring(++f,cnt);
            beg=Integer.parseInt(subs);
        }
        return list;
    }
}