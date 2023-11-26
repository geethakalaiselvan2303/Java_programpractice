package DSA.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class SubarraySumEqualsK {
	
	/*
	 * https://leetcode.com/problems/subarray-sum-equals-k/
	 * 
	 *   Declare pointer as 0, numItself as 0, count as 0
	 *   Create the list and add the values from the nums[] with length of k value
	 *   create the helper fuction to add the values and chec it equla to k value
	 *   check if the nums[numItself] as k value
	 *   	if yes then count++
	 *   else
	 *   	use sliding window then use helper function to add and check if equal to k  
	 *   
	 *   
	 *   
	 */

	@Test
	public void testSubArray() {
		int subarraySum = subarraySum(new int[] {1,1,1},2);
		Assert.assertEquals(subarraySum, 2);
	}
	
	@Test
	public void testSubArray1() {
		int subarraySum = subarraySum(new int[] {1,2,3},3);
		Assert.assertEquals(subarraySum, 2);
	}
	
	@Test
	public void testSubArray2() {
		int subarraySum = subarraySum(new int[] {2,0,1,1},2);
		Assert.assertEquals(subarraySum, 4);
	}

	public int subarraySum(int[] nums, int k) {
		int count=0,left=0,right=0;
		int sum=nums[left];
		while(right<nums.length) {
			if(sum<k) {
				right++;
				sum=sum+nums[right];
			}
			else if(sum==k) {
				count++;
				left++;
				right++;
			}
			else {
				left++;
			}
		}
		return count;
		
	}
}
