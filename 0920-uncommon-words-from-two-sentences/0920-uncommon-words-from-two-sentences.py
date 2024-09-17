class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        ans = []
        str1 = s1.split(" ")
        str2 = s2.split(" ")
        


        for i in str1:
            if str1.count(i) == 1:
                if i not in str2:
                    ans.append(i)
        for i in str2:
            if str2.count(i) == 1:
                if i not in str1:
                    ans.append(i)
                    
        return ans