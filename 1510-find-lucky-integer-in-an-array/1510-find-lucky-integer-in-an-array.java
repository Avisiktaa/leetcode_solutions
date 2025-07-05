class Solution {
    public int findLucky(int[] arr) {
        int res=-1;
       HashMap<Integer,Integer> mp=new HashMap<>();

       for(int i=0;i<arr.length;i++)
       {
        mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
       }

       for(int key:mp.keySet())
       {
        if(mp.get(key)==key)
        res=key;
       }

       return res;
    }
}