class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        int maj1=0;
        int maj2=0;
        int cnt1=0;
        int cnt2=0;

        for(int num:nums)
        {
            if(num==maj1)
            cnt1++;
            else if(num==maj2)
            cnt2++;
            else if(cnt1==0)
            {
                maj1=num;
                cnt1++;
            }
            else if(cnt2==0)
            {
                maj2=num;
                cnt2++;
            }
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int num:nums)
        {
            if(num==maj1)
            cnt1++;
            else if(num==maj2)
            cnt2++;
        }
        if(cnt1>n/3)
        res.add(maj1);
        if(cnt2>n/3)
        res.add(maj2);
        return res;
    }
}