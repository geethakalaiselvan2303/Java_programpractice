package DSA.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class FindAllAnagramsString {
	
	/*
	 * https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
	 *  1. Declare the variable pointer as 0;
	 *  2. Declare the 2 empty array with 26 length
	 *  3. add the p values in the pchar[]
	 *  4. iterate through s string add the character in the schar[]
	 *  5. check for the condition whether the pchar[] and schar[] are equals
	 *  	if yes get the index value and add it in list
	 * 
	 */
	
	@Test
	public void test1() {
		findAnagrams("cbaebabacd","abc");
	}
	@Test
	public void test2() {
		findAnagrams("baa","aa");
	}

	public void findAnagrams(String s, String p) {
		List<Integer> list=new ArrayList<Integer>();
		int[] schar=new int[26];
		int[] pchar=new int[26];
		int pointer=0,i=0;
		int pSize=p.length();
		while(i<pSize) {
			pchar[p.charAt(i++)-'a']++;
		}
		while(pointer<s.length() && pointer<pSize) {
			schar[s.charAt(pointer++)-'a']++;
		}
		if(isAnagaram(pchar,schar)) {
			list.add(pointer-pSize);
		}
		
		while(pointer<s.length()) {
			schar[s.charAt(pointer-pSize)-'a']--;
			schar[s.charAt(pointer++)-'a']++;
			if(isAnagaram(pchar,schar)) {
				list.add(pointer-pSize);
			}
		}
		
		System.out.println(list);
	}
	public boolean isAnagaram(int[] pchar, int[] schar) {
		return Arrays.equals(pchar, schar);
	}	
	
	
}


