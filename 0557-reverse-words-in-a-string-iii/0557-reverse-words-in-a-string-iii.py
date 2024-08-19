class Solution:
    def reverseWords(self, s: str) -> str:
        word=s.split(' ')
        rev=[]
        for w in word:
            rev.append(w[::-1])
        return ' '.join(rev)