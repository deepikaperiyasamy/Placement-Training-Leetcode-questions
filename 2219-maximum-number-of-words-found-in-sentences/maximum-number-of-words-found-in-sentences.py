class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        
        ans = 0
        for string in sentences :
            ans = max(ans,len(string.split()))
        return ans