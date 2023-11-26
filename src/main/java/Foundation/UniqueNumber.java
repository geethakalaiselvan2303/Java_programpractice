package Foundation;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class UniqueNumber {
	
	/*  Given an array of integers arr, return true if the number of occurrences of each value 
	 *  in the array is unique or false otherwise.
		Input: arr = [1,2,2,1,1,3]
		Output: true
		
		Add the values in the set and map and check both are equal in size
	 * 
	 */
	
	@Test
	public void test_UniqueNumber() {
		boolean uniqueNumber = uniqueNumber(new int[] {1,2,2,1,1,3});
		Assert.assertEquals(uniqueNumber, true);
	}
	
	@Test
	public void test_UniqueNumber1() {
		boolean uniqueNumber = uniqueNumber(new int[] {1,2,2,1,3});
		Assert.assertEquals(uniqueNumber, false);
	}

	public boolean uniqueNumber(int[] nums) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		Set<Integer> set=new HashSet<Integer>();
		for (int n1 : nums) {
			map.put(n1, map.getOrDefault(n1, 0)+1);
		}
		Collection<Integer> values = map.values();
		for (int n : values) {
			set.add(n);
		}
		return map.size()==set.size();
	}

}
