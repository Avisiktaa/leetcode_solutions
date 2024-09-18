class Solution {
    public String largestNumber(int[] nums) {
        String st[]=new String[nums.length];
        for(int i=0;i<st.length;i++)
        {
            st[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(st,(a,b)->(b+a).compareTo(a+b));
        StringBuilder res=new StringBuilder();
        for(String ch:st){
            res.append(ch);
        }
        if(res.charAt(0)=='0')
        return "0";
        return res.toString();
    }
}