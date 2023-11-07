package HashMap;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class ValidAnagram {

	/*
	 * https://leetcode.com/problems/valid-anagram/
	 */
	
	@Test
	public void test() {
		boolean anagram = isAnagram("anagram","nagaram");
		Assert.assertEquals(anagram, true);
	}

	public boolean isAnagram(String s1, String s2) {
		int[] arr1=new int[26];
		int[] arr2=new int[26];
		for(char c1:s1.toCharArray()) {
			arr1[c1-'a']++;
		}
		for(char c2:s2.toCharArray()) {
			arr2[c2-'a']++;
		}
		return Arrays.equals(arr1, arr2);
	}
}
