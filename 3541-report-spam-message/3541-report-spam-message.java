class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> bann=new HashSet<>(List.of(bannedWords));
        int count=0;
        for(String mes:message)
        {
            if(bann.contains(mes)) count++;
            if(count>=2) return true;
        }
        return false;
    }
}