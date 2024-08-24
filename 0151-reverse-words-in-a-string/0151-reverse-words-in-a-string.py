class Solution:
    def reverseWords(self, s: str) -> str:
        words=s.split()
        rev=words[::-1]
        rev_string=' '.join(rev)
        return rev_string
        