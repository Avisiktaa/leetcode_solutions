class Solution {
    public int findMinDifference(List<String> timePoints) {
     int []mins=new int[timePoints.size()];
     for(int i=0;i<timePoints.size();i++)
     {
        String time=timePoints.get(i);
        int hrs=Integer.parseInt(time.substring(0,2));
        int min=Integer.parseInt(time.substring(3));
        mins[i]=hrs*60+min;
     }  
     Arrays.sort(mins);

     int diff=Integer.MAX_VALUE;
     for(int i=0;i<mins.length-1;i++)
     {
        diff=Math.min(diff,mins[i+1]-mins[i]);
     }
     diff=Math.min(diff,24*60-mins[mins.length-1]+mins[0]);
     return diff; 
    }
}