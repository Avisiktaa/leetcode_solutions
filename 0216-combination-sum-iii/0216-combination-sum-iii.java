class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        back(k,n,res,ds,1);
        return res;
    }
    public void back(int k,int n,List<List<Integer>> res,List<Integer> ds,int st)
    {
        if(ds.size()==k && n==0)
        {
            res.add(new ArrayList<>(ds));
            return;
        }
        if(ds.size()==k)
        return;
        for(int i=st;i<=9;i++)
        {
            if(i>n)
            break;

            ds.add(i);
            back(k,n-i,res,ds,i+1);
            ds.remove(ds.size()-1);
        }
    }
}