class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int m=a.length,n=b.length;
        int z=m+n;
        int[] arr=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n)
        {
            if(a[i]<=b[j])
            {
                arr[k++]=a[i++];
            }
            else
            arr[k++]=b[j++];
        }
        while(i<m)
        arr[k++]=a[i++];
        while(j<n)
        arr[k++]=b[j++];

        if(z%2==1)
        return arr[z/2];
        
        return (double)(arr[z/2]+arr[(z/2)-1])/2;

    }
}