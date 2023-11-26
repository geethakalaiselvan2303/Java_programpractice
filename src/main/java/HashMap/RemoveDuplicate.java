package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class RemoveDuplicate {
	
	/* 1. Create the set and add the values in the set 
	 * 2. Create the new array with the length of set size
	 * 3. iterate with set and add the values in the new array
	 * 4. Print the array and array size
	 * 
	 * Time Complexity--> O[2N]
	 * Space Complexity--> O[1]
	 */
	
	@Test
	public void test_removeDuplicate() {
		removeDuplicate(new int[] {1,1,2,3});
	}

	public void removeDuplicate(int[] nums) {
		List<Integer> list=new ArrayList<Integer>();
		int left=0,right=1;
		while(right<nums.length) {
			if(nums[left]!=nums[right]) {
				list.add(nums[left]);
				left=right+1;
				right=right+2;
			}
			else {
				left++;
				right++;
			}
		}
		System.out.println("RemoveDuplicate:"+list);
		System.out.println("Size of array after removing duplicate:"+list.size());
	}

}
