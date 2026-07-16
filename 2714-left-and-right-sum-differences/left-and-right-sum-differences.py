class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        
        total = sum(nums)
        leftsum = 0
        for i in range(0,len(nums)) :
            leftsum+=nums[i]
            rightsum = total - leftsum + nums[i]
            nums[i] = abs(rightsum - leftsum)

        return nums