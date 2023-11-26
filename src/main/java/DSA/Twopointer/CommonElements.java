package DSA.Twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.hpsf.Array;
import org.junit.Test;
import org.testng.Assert;

public class CommonElements {
	@Test
	public void test1() {
		List<Integer> intersect = CommonElement(new int[] {1,2,3,4},new int[] {1,2,5,6});
		Assert.assertEquals(intersect, Arrays.asList(1,2));
	}

	public List<Integer> CommonElement(int[] nums1, int[] nums2) {
		List<Integer> list=new ArrayList<Integer>();
		int left=0,right=0;
		while(left<nums1.length && right<nums2.length) {
			if(nums1[left]<nums2[right]) {
				left++;
			}
			else if(nums1[left]>nums2[right]) {
				right++;
			} 
			else{
				list.add(nums1[left]);
				left++;
				right++;
			}
		}
		System.out.println(list);
		return list;
	}
	

}
