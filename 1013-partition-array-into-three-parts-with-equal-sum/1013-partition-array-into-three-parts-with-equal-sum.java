class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int num:arr)
        {
            sum+=num;
        }
        if(sum%3!=0)
        return false;

        int req=sum/3;
        sum=0;
        int i=0,count=0;
        while(i<arr.length)
        {
            sum+=arr[i];
            if(sum==req)
            {
                count++;
                if(count==3)
                return true;
                sum=0;
            }
            i++;
        }
        return false;
    }
}