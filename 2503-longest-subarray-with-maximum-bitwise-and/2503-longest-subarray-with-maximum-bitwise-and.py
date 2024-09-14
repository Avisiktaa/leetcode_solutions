class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        maxvalue=max(nums)
        count=0
        length=0
        for m in nums:
            if m==maxvalue:
                count+=1
                length=max(length,count)
            else:
                count=0
        return length