class MyCalendarTwo {
    List<int[]> single=new ArrayList<>();
     List<int[]> doublebook=new ArrayList<>();  
    public MyCalendarTwo() {
      
    }
    
    public boolean book(int start, int end) {
        for(int[] book:doublebook)
        {
            if(Math.max(start,book[0])<Math.min(end,book[1]))
            return false;
        }
        for(int[] book:single)
        {
            if(Math.max(start,book[0])<Math.min(end,book[1]))
            doublebook.add(new int[]{Math.max(start,book[0]),Math.min(end,book[1])});
        }
        single.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */