package HashMap;

import org.junit.Test;
import org.testng.Assert;

public class Palidrome {
	
	@Test
	public void testPalidrome() {
		boolean palindrome = palindrome("A man, a plan, a canal, Panama");
		Assert.assertEquals(palindrome, true);
	}
	
	@Test
	public void testPalidrome1() {
		boolean palindrome = palindrome("A man, a plan, a canalq, Panama");
		Assert.assertEquals(palindrome, false);
	}


	public boolean palindrome(String s) {
		int left=0,right=s.length()-1;
		while(left<right) {
			if(Character.isLetterOrDigit(s.charAt(left)) && Character.isLetterOrDigit(s.charAt(right))
				&& Character.toLowerCase(s.charAt(left))==Character.toLowerCase(s.charAt(right))){
					left++;
					right--;
				}
			else if(!Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			else if(!Character.isLetterOrDigit(s.charAt(right))){
				right--;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
