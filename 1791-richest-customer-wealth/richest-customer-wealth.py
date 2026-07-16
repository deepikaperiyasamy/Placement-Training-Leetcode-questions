class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        
        ans = 0
        for lst in accounts:
            sum = 0
            for num in lst:
                sum+=num
            ans = max(ans,sum)

        return ans