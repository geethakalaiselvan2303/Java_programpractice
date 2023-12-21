package DSA.Twopointer;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class ReversingTheSentences {
	
	/*  Split the each word 
	 *  create the helper function to reverse the String
	 *  append with each reversed string
	 * 
	 */
	
	@Test
	public void testMagazineRansome() {
		String reversingTheSentences = reversingTheSentences("I am happy  engineer");
		Assert.assertEquals(reversingTheSentences,"I ma yppah  reenigne");
	}
	
	public String reversingTheSentences(String s) {
		int left=0,right=0;
		while(right<s.length()) {
			if(!Character.isLetterOrDigit(s.charAt(left)) && !Character.isLetterOrDigit(s.charAt(right))) {
				left++;
		    	right++;
			}
			else if(Character.isLetterOrDigit(s.charAt(left))&& Character.isLetterOrDigit(s.charAt(right)) && 
					!Character.isLetterOrDigit(s.charAt(right))) {
				right++;
			}
			else {
				reverseString(s,left,right);
				left++;
				right++;
			}
		}
		return s;
	}

	public String reverseString(String str,int left,int right) {
		char[] ch = str.toCharArray();
		while(left<right) {
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
		return String.valueOf(ch);
		
		
	}

}
