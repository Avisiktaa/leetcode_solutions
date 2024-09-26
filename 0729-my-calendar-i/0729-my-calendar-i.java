class MyCalendar {
    public List<int []>calendar;
    public MyCalendar() {
       calendar=new ArrayList<>(); 
    }
    
    public boolean book(int start, int end) {
        for(int[] arr: calendar)
        {
            int st=arr[0];
            int ending=arr[1];
            if(start<ending && end>st)
            return false;
        }
        calendar.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */