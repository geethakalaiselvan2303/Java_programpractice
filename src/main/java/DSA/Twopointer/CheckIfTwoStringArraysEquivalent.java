package DSA.Twopointer;

import org.junit.Test;

public class CheckIfTwoStringArraysEquivalent {
	
	/* https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent
	 * 
	 *   Create 2 string builder for each string
	 *   append the values of each string 
	 *   then compare sb1.equals(sb2)
	 *   if yes the return true
	 */
	
	/*
	 *  Use map 
	 *  add the values in map for string1 then compare the w
	 */
	
	@Test
	public void test_equivalentString() {
		String[] s1= {"a","cb"};
		String[] s2= {"a","bc"};
		bruteForce_arrayStringsAreEqual(s1,s2);
	}
	
	public boolean bruteForce_arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		for (String s1 : word1) {
			sb1.append(s1);
		}
		for (String s2 : word2) {
			sb2.append(s2);
		}
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());
		return sb1.toString().equals(sb2.toString());
        
    }

}
