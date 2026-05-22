class Solution {
    public int search(int[] a, int target) {
        int n=a.length;
        int start=0,end=n-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(a[mid]==target)
            return mid;

             else if(a[mid]<a[end])
            {
                if(target>a[mid] && target<=a[end])
                {
                    start=mid+1;
                }
                else
                end=mid-1;
            }
            else 
            {
                if(target>=a[start] && target<a[mid])
                {
                    end=mid-1;
                }
                else
                start=mid+1;
            }}
            return -1;
        
    }
}