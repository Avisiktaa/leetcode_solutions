class Solution {
    public long maxKelements(int[] nums, int k) {
        long maxscore=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        int times=0;
        while(times!=k)
        {
            int n=pq.poll();
            maxscore+=n;
            pq.add((int)Math.ceil((double)n/3));
            times++;
        }
        return maxscore;
    }
}