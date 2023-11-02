package Foundation;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class LongPressedName {
	
	/* https://leetcode.com/problems/long-pressed-name/	 
	 *  move the left and right pointer if both are same
	 *  else check for the condition ch2[right]==ch1[left-1]
	 *  if yes right++;
	 *  
	 *  Time--> O[n]
	 *  Space-->o[1]
	 */
	
	@Test
	public void test1() {
		boolean longPressedName = isLongPressedName("alex","aaleex");
		Assert.assertEquals(longPressedName, true);
	}
	
	@Test
	public void test2() {
		boolean longPressedName = isLongPressedName("saeed","ssaaedd");
		Assert.assertEquals(longPressedName, false);
	}

	public boolean isLongPressedName(String name, String typed) {
		 char[] ch1 = name.toCharArray();
			char[] ch2 = typed.toCharArray();
			int left=0,right=0;
			while(right<typed.length()) {
				if(left<name.length()&&ch1[left]==ch2[right]) {
					left++;
					right++;
				}
				else if(left!=0 && ch2[right]==ch1[left-1] ){
					right++;
				}
				else{
					return false;
				}
			}
			
			return left==name.length();

	}
}
