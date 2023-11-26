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
		reversingTheSentences("I am happy  engineer");
//		Assert.assertEquals(, );
	}
	
	public void reversingTheSentences(String s) {
		String[] splitEachWord = s.split("//s");
		for (int i = 0; i < splitEachWord.length; i++) {
			String reverseString = reverseString(splitEachWord[i]);
			
		}
		
	}

	public String reverseString(String str) {
		int left=0,right=str.length()-1;
		char[] ch = str.toCharArray();
		int start=0,end=str.length()-1;
		while(start<end) {
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end--]=temp;
		}
		return String.valueOf(ch);
		
		
	}

}
