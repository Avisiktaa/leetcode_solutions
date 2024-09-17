class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        ans=[]
        s3=s1+' '+s2
        count=0
        s4=s3.split(' ')
        for i in range(len(s4)):
            if s4.count(s4[i]) < 2:
                ans.append(s4[i])
        return ans