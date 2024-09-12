class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        cnt=len(words)
        for word in words:
            for c in word:
                if c not in allowed:
                    cnt-=1
                    break
        return cnt