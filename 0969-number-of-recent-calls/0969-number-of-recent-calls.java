class RecentCounter {
    private static final int[] records=new int[10000];
    private int front;
    private int rear;
    public RecentCounter() {
      front=0;
      rear=0;  
    }
    
    public int ping(int t) {
       while(front<rear && (t-records[front]>3000))
       front++;
       records[rear++]=t;
       return rear-front; 
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */