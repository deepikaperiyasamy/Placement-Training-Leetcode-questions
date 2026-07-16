class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        
        ans = 0
        for string in sentences :
            words = string.split()
            ans = max(ans,len(words))
        return ans