package DSA.SlidingWindow;

import org.junit.Assert;
import org.junit.Test;

public class FindSubArray {
	
	/*  Declare the pointer as 0
	 *  Iterate with nums and add the k size value and store it in max variable
	 *  subtract the first value from the max and add the next index values
	 *  Compare the max values
	 *  iterate still the loop end 
	 *  return the max values	
	 *  
	 *  TC-> O(N) 
	 *  SC-> O(1) 
	 * 
	 */
	
	@Test
	public void testFindMaxSubArray() {
		int findMaxSubArray = findMaxSubArray(new int[] {1,5,2,3,7}, 3);
		Assert.assertEquals(findMaxSubArray, 12);
	}

	public int findMaxSubArray(int[] nums, int k) {
		int pointer=0;
		int maxSum=0;
		int windowSum=0;
		while(pointer<k) {
			windowSum=windowSum+nums[pointer++];
		}
	   	for (int i = k; i < nums.length; i++) {
			windowSum = windowSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, windowSum);
		}
	   	System.out.println(maxSum);
	   	return maxSum;
	}

}
