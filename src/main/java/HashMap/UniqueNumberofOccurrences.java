package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class UniqueNumberofOccurrences {
	
	/*
	 * https://leetcode.com/problems/unique-number-of-occurrences
	 */

	
	@Test
	public void test() {
		boolean uniqueOccurrences = uniqueOccurrences(new int[] {-3,0,1,-3,1,1,1,-3,10,0});
		Assert.assertEquals(uniqueOccurrences, true);
	}
	public boolean uniqueOccurrences(int[] arr) {
		 Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	        for(int n:arr){
	            map.put(n,map.getOrDefault(n,0)+1);
	        }
	        Set<Integer> set=new HashSet<Integer>(map.values());
			return map.size()==set.size();
    }
}
