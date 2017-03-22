class Solution:
	def twoSum(self, nums, target):
		map = {}
		for i,val in enumerate(nums):
			# print i,val
				if target-val in map: # val is already in nums, check if the target - val is in the map?
					# print target,val
					return [map[target-val],i] # return the index of target-val index and the index of val!
				map[val] = i 
				# print map



mySol = Solution()
print mySol.twoSum([2, 7, 11, 15],9)
