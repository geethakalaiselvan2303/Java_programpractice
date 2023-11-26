package Foundation;

import org.junit.Test;
import org.testng.Assert;
import java.util.Stack;

public class MaxConsecutiveOnesIII {
	
	/*  https://leetcode.com/problems/max-consecutive-ones-iii/
	 * 
	 *   
	 *   Declare the left as 0 and right as 0 and max variable
	 *   check for the condition nums[right] is zero
	 *   if it's zero then increment the right pointer and decrement the k value
	 *   	also check whether the k value is zero
	 *      calculate the max value right-left+1
	 *      then reset the k value
	 *      then increment the left and assign right=left
	 *         
	 * 
	 */
	
	//@Test
		public void test_TwoPointer() {
			int maxConsecutiveOnesIII = maxConsecutiveOnesIII(new int[] {1,1,1,0,0,0,1,1,1,1,0},2);
			Assert.assertEquals(maxConsecutiveOnesIII, 6);
		}

		@Test
		public void test_TwoPointer1() {
			int maxConsecutiveOnesIII = maxConsecutiveOnesIII(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1},3);
			Assert.assertEquals(maxConsecutiveOnesIII, 10);
		}
		public int maxConsecutiveOnesIII(int[] nums, int k) {
			int left = 0, right = 0,zeroCount=0;
		    int max = Integer.MIN_VALUE;
		    while (right < nums.length) {
		        if (nums[right] == 0) {
		        	zeroCount++;
		        } 
		        while(zeroCount>k) {
		        	if(nums[left]==0) {
		        		zeroCount--;
		        	}
		        	left++;
		        	
		         }
		         max=Math.max(max, right - left+1);
		        	right++;
		        }
		     return max;

			
		}
}
