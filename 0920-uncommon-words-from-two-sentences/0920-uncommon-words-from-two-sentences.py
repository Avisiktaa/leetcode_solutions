class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        ans=[]
        sen1=s1.split(' ')
        sen2=s2.split(' ')

        for i in sen1:
            if sen1.count(i) == 1:
                if i not in sen2:
                    ans.append(i)
        for i in sen2:
            if sen2.count(i) == 1:
                if i not in sen1:
                    ans.append(i)
        return ans