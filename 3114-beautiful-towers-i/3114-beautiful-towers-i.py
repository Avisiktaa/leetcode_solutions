class Solution:
    def maximumSumOfHeights(self, heights: List[int]) -> int:
        ans=0
        n=len(heights)
        for i in range(n):
            now=x=heights[i]
            for j in range(i-1,-1,-1):
                x=min(x,heights[j])
                now+=x
            x=heights[i]
            for j in range(i+1,n):
                x=min(x,heights[j])
                now+=x
            ans=max(ans,now)
        return ans
