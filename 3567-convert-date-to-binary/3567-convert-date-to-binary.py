class Solution:
    def convertDateToBinary(self, date: str) -> str:
        
        s=date.split('-')
        return bin(int(s[0]))[2:]+'-'+bin(int(s[1]))[2:]+'-'+bin(int(s[2]))[2:]