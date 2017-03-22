class Solution(object):
    def lengthOfLongestSubstring(self, s):
    	largerStr = ''
    	tmpStr = ''
    	for x in s:
    		if x not in tmpStr:
    			tmpStr = tmpStr + x
    		else:
    			if len(tmpStr) > len(largerStr):
    				largerStr = tmpStr
    			tmpStr = ''

    	return len(largerStr)






mySol = Solution()
print mySol.lengthOfLongestSubstring("pwwkew")
