package CompanywiseQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BiggestOfProduct3 {
	  
	/*    Yubi and ThreadAvenue
	 *   find biggest multiplication of 3 numbers in array
			n =  [3,5,8,1,2,0,6,4]
			
	     Testdata 1. [3,5,8,1,2,0,6,4]  2. [] 3. [2,3]
	     1. Sort the numbers
	     2. 		 
	 */
	
	
	@Test
	public void test1() {
		List<Integer> biggestOfProduct3 = biggestOfProduct3(new int[] {-9,-10,8,1,2,0,6,4}); //0,1,2,3,4,5,6,8
		Assert.assertEquals(biggestOfProduct3, Arrays.asList(-10,-9,8));
	}

	public List<Integer> biggestOfProduct3(int[] arr) {
		List<Integer> list=new ArrayList<>();

		if(arr==null || arr.length<3 ) {
			return list;
		}
		int first=0,last=0;
		Arrays.sort(arr);
		int i=0;
		while(arr.length>2) {
			first=arr[i]*arr[i+1];
			last=arr[arr.length-1]*arr[arr.length-2];
			if(first>last) {
				list.add(arr[i]);
				list.add(arr[i+1]);
				list.add(arr[arr.length-1]);
				break;
			}
			else {
		     	list.add(arr[arr.length-1]);
				list.add(arr[arr.length-2]);
				list.add(arr[arr.length-3]);
				break;

			}
		}
		
		return list;
		
	}
	
	

}
