class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.split()
        s1=s[::-1]
        s1 = " ".join(s1)
        return s1