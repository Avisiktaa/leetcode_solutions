class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(char ch:word.toCharArray())
        {
            set.add(ch);
        }
         for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isUpperCase(ch)) {
                char lower = Character.toLowerCase(ch);
                if (set.contains(lower)) {
                    count++;
                    set.remove(ch);
                    set.remove(lower);
                }
            } else {
                char upper = Character.toUpperCase(ch);
                if (set.contains(upper)) {
                    count++;
                     set.remove(ch);
                    set.remove(upper);
                }
            }
        }
        return count;
    }
}