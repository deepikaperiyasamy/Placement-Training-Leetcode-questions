class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        
        lst = []
        right = n
        left = 0
        j=0
        while left<len(nums) and right<len(nums) :
            lst.append(nums[left])
            lst.append(nums[right])
            left+=1
            right+=1

        return lst