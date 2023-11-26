package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class MaxSumOfAPairWithEqualSumOfDigits {
	
	/*  https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/
	 * 
	 *   Declare max value
	 *   Create the HashMap with <Integer and list of integers>
	 *   Get the sum of each number and store it as key
	 *   store the number as value
	 *   
	 *   Iterate with map sum the values based on key and find the max and return
	 * 
	 */

	
	@Test
	public void testSumOfAPair() {
		maximumSum(new int[] {18,43,36,13,7});
	}
	
	public int maximumSum(int[] nums) {
		int max=Integer.MIN_VALUE;
		Map<Integer,List<Integer>> map=new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int sum=getSum(nums[i]);
			 if (map.containsKey(sum)) {
		            List<Integer> list = map.get(sum);
		            list.add(nums[i]);
		            map.put(sum, list);
		        } else {
		            List<Integer> newList = new ArrayList<>();
		            newList.add(nums[i]);
		            map.put(sum, newList);
		        }
		}
		
		if(map.size()==nums.length){
			return -1;
		}
		System.out.println(map);
		int sum=0;
		for (Map.Entry<Integer,List<Integer>> entry : map.entrySet()) {
			for (int i : entry.getValue()) {
				sum=sum+i;
			}
			max=Math.max(max, sum);
			sum=0;
		}
		return max;
        
    }

	public int getSum(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
}
