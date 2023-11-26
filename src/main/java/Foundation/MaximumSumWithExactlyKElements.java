package Foundation;

import org.junit.Test;
import org.testng.Assert;

public class MaximumSumWithExactlyKElements {
	
	/*  https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/submissions/ 
	 * Declare the max as Integer.minvaue
	 * Iterate with nums and Find the max value from the nums
	   Do the max+i and  iterate with k size
	 * 
	 */
	
	@Test
	public void test1() {
		int maximizeSum = maximizeSum(new int[] {1,2,3,4,5},3);
		Assert.assertEquals(maximizeSum, 18);
	}

	
	public int maximizeSum(int[] nums, int k) {
		int max=Integer.MIN_VALUE;
		int output=0;
		for (int i = 0; i < nums.length; i++) {
			max=Math.max(max, nums[i]);
		}
		for (int i = 0; i < k; i++) {
			output=output+max+i;
		}
		System.out.println(output);
		return output;
        
    }
}
