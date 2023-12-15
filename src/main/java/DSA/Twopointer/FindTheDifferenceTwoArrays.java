package DSA.Twopointer;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FindTheDifferenceTwoArrays {
	
	/* https://leetcode.com/problems/find-the-difference-of-two-arrays/description/
	 * 
	 */
	
	@Test
	public void test_twoPointer() {
		int[] n1= {1,2,3,1}; 
		int[] n2= {2,4,6};
		findDifference(n1,n2);
	}

	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>(); 
		int left=0,right=0;  
		while(left<nums1.length && right<nums2.length) {
			if(nums1[left]<nums2[right]) {
				if(!(list1.isEmpty() || list1.get(list1.size()-1)!=nums1[left])){
				list1.add(nums1[left]);
				}
				left++;
			}
			else if(nums1[left]>nums2[right]) {
				if(!(list2.isEmpty() || list2.get(list2.size()-1)!=nums2[right])){
				list2.add(nums1[right]);
				}
				right++;
			}
			else {
				left++;
				right++;
			}
		}
		while(left<nums1.length) {
			if(!(list1.isEmpty() || list1.get(list1.size()-1)!=nums1[left])){
				list1.add(nums1[left]);
			}
			left++;
		}
		while(right<nums2.length) {
			if(!(list2.isEmpty() || list2.get(list2.size()-1)!=nums2[right])){
			list2.add(nums2[right]);
			}
			right++;
		}
		List<List<Integer>> listL=new ArrayList<>();
		listL.add(list1);	
		listL.add(list2);	
		System.out.println(listL);
		return listL;
	}
}
