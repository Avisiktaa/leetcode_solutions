class Solution {
    public int findComplement(int num) {
      String str=Integer.toBinaryString(num);
      String result="";
      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)=='0')
        result+='1';
        else
        result+='0';
      }  
      return Integer.parseInt(result,2);
    }
}