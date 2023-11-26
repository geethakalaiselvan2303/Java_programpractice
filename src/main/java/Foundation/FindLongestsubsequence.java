package Foundation;

import org.junit.Test;
import org.testng.Assert;

public class FindLongestsubsequence {
	
	/* Delcare the slow as 0 and fast as 1 pointer
	 * Declare the variable max
	 * iterate with give array 
	 * check for the condition whether the slow pointer value ins less than fast pointer value
		 *  if yes get the value of max as fast-slow
		 *  assign the slow to fast then increment fast
	 *  else
	 *    fast+2
	 *    
	 *   return the max value 
	 *   
		 *   Initialise the pointers
	    left = 0, right = 0, max_length = 1, current_length = 1
	
	    Iterate through the array
	        >> If the next element is greater than the current element
	            > Increase the current length
	            > Move the right pointer forward
	            > Update max_length if current_length is greater
	        else:
	            > If the sequence is not increasing, reset the current length
	            > Move both pointers forward
	    return max_length
	 * 
	 */
	
	@Test
	public void test_TwoPointer() {
		int findLongestsubsequence = findLongestsubsequence(new int[] {7,4,6,12,14,14,121});
		Assert.assertEquals(findLongestsubsequence, 4);
	}

	public int findLongestsubsequence(int[] nums) {
		int left = 0, right = 0;
		int max = Integer.MIN_VALUE;
		while (right < nums.length-1) {
			if (nums[right] < nums[right + 1] && right < nums.length) {
				right++;
				max = Math.max(right - left + 1, max);
			} 
			else {
				right++;
				left = right;
			}
		}
		return max;
	}

}
