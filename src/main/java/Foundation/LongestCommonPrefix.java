package Foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class LongestCommonPrefix {
	
	/* https://leetcode.com/problems/longest-common-prefix/description/
	 * 1. Create empty string
	 * 2. check for the condition whether str is null || str.length is equal to zero
	 * 		if yes return ""
	 * 3. check for the condition whether strs.length is 1 
	 * 		if yes return the same string
	 * 4. sort the string[]
	 * 5. compare the first and last whether each characters are equal
	 * 		 if yes add it with empty string
	 * 
	 *  Time complexity--> nlogn
	 *  space complexity--> o[1]
	 * 
	 */
	@Test
	public void test1() {
		longestCommonPrefix(new String[] { "flower", "flow", "flight" });
	}
	
	@Test
	public void test2() {
		longestCommonPrefix2(new String[] { "flower", "flow", "flight" });
	}

	/* Taking the flower then comparing the each letter with flow and flight whether
	 *  all the characters are equal
	 * 
	 */
	public String longestCommonPrefix2(String[] strs) {
		        StringBuilder sb=new StringBuilder();
				if (strs == null || strs.length == 0) {
					return "";
				}
				else if (strs.length == 1) return strs[0];
				else{
				String firstString = strs[0];
				for (int i = 0; i < firstString.length(); i++) {
					char charAt_i = firstString.charAt(i);
					for (int j = 1; j < strs.length; j++) {
						if(i>=strs[j].length() || charAt_i!=strs[j].charAt(i)) {
							return sb.toString();
						}
						if(j==strs.length-1) {
							sb.append(charAt_i);
						}
					}
					}
				}
				return sb.toString();
	}

	public String longestCommonPrefix(String[] strs) {
		String output = "";
		if (strs == null || strs.length == 0) {
			return "";
		}
		if (strs.length == 1) return strs[0];
		Arrays.sort(strs);
		char[] first = strs[0].toCharArray();
		char[] last = strs[strs.length - 1].toCharArray();

		for (int i = 0; i < first.length; i++) {
			if (first[i] == last[i]) {
				output = output + first[i];
			} else {
				break;
			}
		}

		return output;

	}

}
