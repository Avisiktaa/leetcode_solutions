class Solution:
    def reverseWords(self, s: str) -> str:
        word=s.split(' ')
        rev=[w[::-1] for w in word]
        return ' '.join(rev)
           