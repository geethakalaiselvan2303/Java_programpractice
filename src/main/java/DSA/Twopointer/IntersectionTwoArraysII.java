package DSA.Twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class IntersectionTwoArraysII {
	
	/* https://leetcode.com/problems/intersection-of-two-arrays-ii/description/	 */
	
	@Test
	public void test1() {
		int[] intersect = intersect(new int[] {1,2,2,1},new int[] {2,2});
		Assert.assertEquals(intersect, new int[] {4,9});
	}
	
	//@Test
	public void test2() {
		List<Integer> intersect2 = intersect2(new int[] {1,2,2,1},new int[] {2,2});
		System.out.println(intersect2);
	}

	public List<Integer> intersect2(int[] nums1, int[] nums2) {
		Arrays.sort(nums1); 
		Arrays.sort(nums2);
		List<Integer> list=new ArrayList<Integer>();
		int start=0,end=0;
		while(start<nums1.length && end<nums2.length) {
			if(nums1[start]<nums2[end]) {
				start++;
			}
			else if(nums1[start]>nums2[end]) {
				end++;
			}
			else {
				if(!list.contains(nums1[start])) {
				list.add(nums1[start]);
				}
				start++;
				end++;
			}
		}
		return list;
	}

	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list=new ArrayList<Integer>();
		Map<Integer,Integer> map1=new HashMap<Integer,Integer>();
		
		for (int n1 : nums1) {
			map1.put(n1, map1.getOrDefault(n1, 0)+1);
		}
		for (int num : nums2) { //2
			if(map1.containsKey(num) && map1.get(num)>0) {
				list.add(num);
				//map1.put(num, map1.get(num)-1);
			}
			
		}
		
		int[] output=new int[list.size()];
		int i=0;
		for (int j : list) {
			output[i++]=j;
		}
		System.out.println(Arrays.toString(output));
		return output;
	}
}
