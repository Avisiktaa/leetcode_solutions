class Solution(object):
    def maxDistance(self, arrays):
        small=arrays[0][0]
        big=arrays[0][-1]
        dis=0
        for i in range(1,len(arrays)):
            a=arrays[i]
            dis=max(dis,abs(small-a[-1]),abs(big-a[0]))
            small=min(small,a[0])
            big=max(big,a[-1])
        
        return dis    
        
        