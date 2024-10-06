class Solution:
    def areSentencesSimilar(self, sentence1: str, sentence2: str) -> bool:
        s1=sentence1.split()
        s2=sentence2.split()
        n1=len(s1)
        n2=len(s2)

        st1=0
        st2=0
        end1=n1-1
        end2=n2-1
        while st1<=end1 and st2<=end2 and s1[st1]==s2[st1]:
            st1+=1
            st2+=1
        while end1>=st1 and end2>=st2 and s1[end1]==s2[end2]:
            end1-=1
            end2-=1
        if end1<st1 or end2<st2:
            return True
        return False
