package Foundation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class RemoveDuplicatesFromSortedArrayII {
	
	/*
	 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
	 * 
	 * 1. Declare the k as 0, output as length-1
	 * 2. Declare the left and right as 0
	 * 3. check for the condition nums[left] and nums[right] are same if same increment the right then decrement the output
	 * 		also check for the condition whether the k>2
	 *      resign the k value to zero
	 * 4.  else if nums[left] and nums[right] are not same
	 * 		assign the left =right
	 * 5. iterate still the loop end 
	 * 6. return the output
	 *     
	 */
	
	
	@Test
	public void test() {
		int removeDuplicates = removeDuplicates(new int[] {1,1,1,2,2,3});
		Assert.assertEquals(removeDuplicates, 5);
	}
	
	@Test
	public void test1() {
		int removeDuplicates = removeDuplicates(new int[] {0,0,1,1,1,1,2,3,3});
		Assert.assertEquals(removeDuplicates, 7);
	}
	
	 public int removeDuplicates(int[] nums) {
		List<Integer> list=new ArrayList<Integer>();
		int left=0,right=0,k=0;
		int output=nums.length;
		while(right<nums.length) {
			if(nums[left]!=nums[right]) {
				left=right;
				k=0;
			}
			else if(right<nums.length){
				right++;
				k++;
				if(k>2) {
					output--;
				}
			}
		}
		return output;
	        
	    }

}
