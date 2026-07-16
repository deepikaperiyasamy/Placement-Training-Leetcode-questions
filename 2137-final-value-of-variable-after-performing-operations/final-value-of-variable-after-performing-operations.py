class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        
        x = 0
        for str in operations :
            if str == "X++" or str == "++X" : x+=1
            else : x-=1
        return x