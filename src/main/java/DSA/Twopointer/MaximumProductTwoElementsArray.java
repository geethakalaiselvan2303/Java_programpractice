package DSA.Twopointer;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class MaximumProductTwoElementsArray {

	/*
	 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
	 * 
	 * 1. Sort the array 1. Start the pointer with left=0, right=1 2. Iterate with
	 * array check for the condition whether the product of left and right 3. Keep
	 * iterating still the max product array
	 * 
	 */

	// @Test
	public void test_BructeForce() {
		int maxProduct = maxProduct(new int[] { 3, 4, 5, 2 });
		Assert.assertEquals(maxProduct, 12);
	}

	@Test
	public void test_BructeForce1() {
		int maxProduct = maxProduct1(new int[] { 3, 4, 5, 2 });
		Assert.assertEquals(maxProduct, 12);
	}

	public int maxProduct1(int[] nums) {
		int maxProd = 0;
		for (int i = 0; i < nums.length; i++) {
			int currProd = 0;
			for (int j = i + 1; j < nums.length; j++) {
				currProd = (nums[i] - 1) * (nums[j] - 1);// 6
				maxProd = Math.max(maxProd, currProd);
			}
		}
		return maxProd;
	}

	public int maxProduct(int[] nums) {
		Arrays.sort(nums);
		int left = 0, right = 1;
		int max = Integer.MIN_VALUE;
		while (right < nums.length) {
			int product = (nums[left] - 1) * (nums[right] - 1);
			max = Math.max(max, product);
			left++;
			right++;
		}
		return max;

	}
}
