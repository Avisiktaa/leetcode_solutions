class Solution:
    def chalkReplacer(self, chalk: List[int], k: int) -> int:
        sums=0
        for c in chalk:
            sums+=c
        k=k%sums
        for i in range(0,len(chalk)):
            if k<chalk[i]:
                return i
            k-=chalk[i]

            