package Foundation;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {
	/*
	 * https://leetcode.com/problems/move-zeroes/
	 */

	@Test
	public void test1() {
		moveZeroes(new int[] { 0, 1, 0, 3, 12 });
	}

	public int[] moveZeroes(int[] nums) {
		  int start=0,end=0;
	       while (start < nums.length && end < nums.length) {
	            if(nums[start]==0 && nums[end]==0){
	                end++;
	            }
	            else if(nums[end]!=0){
	                int temp=nums[start];
	                nums[start]=nums[end];
	                nums[end]=temp;
	                start++;
	                end++;
	            }
	        }
	        return nums;
	}
}
