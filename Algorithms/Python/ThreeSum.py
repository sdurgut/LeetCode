class Solution(object):
	def threeSum(self, nums):
		nums.sort()
		matching = []
		idx = 0
		while idx < len(nums):
			jdx = idx + 1
			while jdx < len(nums):
				kdx = jdx + 1
				while kdx < len(nums):
					if nums[idx] + nums[jdx] + nums[kdx] == 0:
						myNums = [nums[idx],nums[jdx],nums[kdx]]
						if myNums not in matching:
							matching.append(myNums)
						
					kdx = kdx + 1
				jdx = jdx + 1
			idx = idx + 1
		return matching



mySol = Solution()
print mySol.threeSum([-1, 0, 1, 2, -1, -4])
