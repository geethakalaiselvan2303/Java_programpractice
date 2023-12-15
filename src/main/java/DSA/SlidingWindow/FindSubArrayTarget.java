package DSA.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FindSubArrayTarget {
	
	public static void main(String[] args) {
		List<List<Integer>> llist=new ArrayList<List<Integer>>();
		List<Integer> list=new ArrayList<>();
		int[] nums= {1,7,4,3,1,2,1,5,1};
		int k=7,sum=0;
		int left=0,right=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[left]<k) {
				right++;
			}
			else if(nums[left]>k) {
				left++;
			}
			else if(nums[left]==k) {
				list.add(left);
				list.add(right);
				llist.add(list);
			}
		}
		System.out.println(llist);
	}

}
