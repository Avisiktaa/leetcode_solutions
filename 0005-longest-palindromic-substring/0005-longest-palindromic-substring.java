class Solution {
    public String longestPalindrome(String s) {
        
        if (s == null || s.length() == 0) return "";

        // Step 1: Transform string
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        for (char c : s.toCharArray()) {
            sb.append(c).append('#');
        }
        String t = sb.toString();
        int n = t.length();

        // Step 2: Array to store palindrome radii
        int[] P = new int[n];
        int center = 0, right = 0;
        int maxLen = 0, maxCenter = 0;

        // Step 3: Expand palindromes
        for (int i = 0; i < n; i++) {
            int mirror = 2 * center - i;

            if (i < right) {
                P[i] = Math.min(right - i, P[mirror]);
            }

            // Try to expand around i
            int a = i + (1 + P[i]);
            int b = i - (1 + P[i]);
            while (a < n && b >= 0 && t.charAt(a) == t.charAt(b)) {
                P[i]++;
                a++;
                b--;
            }

            // Update center and right boundary
            if (i + P[i] > right) {
                center = i;
                right = i + P[i];
            }

            // Track max palindrome
            if (P[i] > maxLen) {
                maxLen = P[i];
                maxCenter = i;
            }
        }

        // Step 4: Extract result
        int start = (maxCenter - maxLen) / 2; // map back to original string
        return s.substring(start, start + maxLen);
    }
}