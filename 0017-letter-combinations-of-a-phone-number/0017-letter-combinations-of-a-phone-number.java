class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();

        if(digits==null || digits.length()==0)
        return res;

        Map<Character,String> dig=new HashMap<>();
        dig.put('2',"abc");
        dig.put('3', "def");
        dig.put('4', "ghi");
        dig.put('5', "jkl");
        dig.put('6', "mno");
        dig.put('7', "pqrs");
        dig.put('8', "tuv");
        dig.put('9', "wxyz");

        backtrack(digits,0,new StringBuilder(),res,dig);
        return res;
    }
    public void backtrack(String digits,int id,StringBuilder comb,List<String> res,Map<Character,String> dig)
    {
        if(id==digits.length())
        {
        res.add(comb.toString());
        return;
        }
        String lets=dig.get(digits.charAt(id));
        for(char let:lets.toCharArray())
        {
            comb.append(let);
            backtrack(digits,id+1,comb,res,dig);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}