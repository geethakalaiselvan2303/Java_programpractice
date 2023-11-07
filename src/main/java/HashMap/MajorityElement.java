package HashMap;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElement {
	/*
	 * https://leetcode.com/problems/majority-element
	 */

	@Test
	public void test1() {
		int majorityElement = majorityElement(new int[] {2,2,1,1,1,2,2});
		Assert.assertEquals(majorityElement, 2);
	}
	
	
	@Test
	public void test2() {
		int majorityElement = majorityElement_2(new int[] {2,2,1,1,1,2,2});
		Assert.assertEquals(majorityElement, 2);
	}
	 public int majorityElement_2(int[] arr) {
		 
		return 0;
	}


	public int majorityElement(int[] nums) {
	        int output=0;
	        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	        for(int n:nums){
	            map.put(n,map.getOrDefault(n,0)+1);
	        }
	        int max = Integer.MIN_VALUE;
	        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
	            if(max<entry.getValue()){    	
	                output=entry.getKey();
	            }
	            

	        }
			return output;
	    }
	}

