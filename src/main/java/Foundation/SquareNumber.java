package Foundation;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class SquareNumber {
	
	/*  1 Iterate with given array
	 *  2. Square each number and store it in same array
	 *  3. Sort the values
	 * 
	 */
	
	@Test
	public void test_Sort() {
		squareNumber(new int[] {-7,-3,2,3,11});
	}
	
	
	/*  1   Declare the right is length and left is 0 pointer
	 *  2. Iterate with given array
	 *  2. compare the right and left pointer values (use math.abs to remove -ve sign)
	 *  	if left less than right
	 *         the multiply the right values and store it in position the right--
	 *     if not multiply the left values and store it in position the left++
	 *  3. return the aary
	 * 
	 */
	@Test
	public void squareNumber_Opt() {
		int[] squareNumber_Opt = squareNumber_Opt(new int[] {-7,-3,2,3,11});
		Assert.assertEquals(squareNumber_Opt, new int[] {4,9,9,49,121});
	}

	public int[] squareNumber_Opt(int[] nums) {
		int[] output=new int[nums.length];
		int left=0,right=nums.length-1;
		for (int i = nums.length-1; i>=0; i--) {
		   if(Math.abs(nums[left])<Math.abs(nums[right])) {
				output[i]=nums[right]*nums[right];
				right--;
			}
			else {
				output[i]=nums[left]*nums[left];
				left++;
			}
		}
		return output;
	}

	public void squareNumber(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i]=nums[i]*nums[i];
		}
		Arrays.sort(nums);	
		}
	}


