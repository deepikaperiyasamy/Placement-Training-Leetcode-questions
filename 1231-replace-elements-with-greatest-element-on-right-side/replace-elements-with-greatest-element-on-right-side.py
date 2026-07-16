class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        
        maxnum = -1

        for i in range(len(arr)-1,-1,-1) :
            curr = arr[i]
            arr[i] = maxnum
            maxnum = max(curr,maxnum)
        return arr