class CustomStack {
    public int top=-1;
    public int stack[];
    public int maxSize;
    public CustomStack(int maxSize) {
        this.stack=new int[maxSize];
        this.top=-1;
        this.maxSize=maxSize;
    }
    
    public void push(int x) {
        if(top<maxSize-1)
        {
            stack[++top]=x;
        }
    }
    
    public int pop() {
        if(top==-1)
        return -1;
        return stack[top--];
    }
    
    public void increment(int k, int val) {
        if(k<top+1)
     {   for(int i=0;i<k;i++)
        {
            stack[i]+=val;
        }
    }
    else
    {
      for(int i=0;i<top+1;i++)
        {
            stack[i]+=val;
        }  
    }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */