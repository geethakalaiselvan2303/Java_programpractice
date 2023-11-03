package Foundation;

import org.junit.Test;

public class ReverseWordsStringIII {
	
	/*
	 * https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/
	 *  Reverse each words using two pointer logic and added it in the stringbuilder
	 *  
	 *  Time Complexity-->
	 *  Space--> Complexity-->
	 *  
	 */

	@Test
	public void test1() {
		reverseWords("Let's take LeetCode contest");
	}
	public String reverseWords(String s) {
		String s1="";
		StringBuilder sb=new StringBuilder();
		String[] split = s.split(" ");
		for (String str : split) {
			s1=revervse(str);
			sb.append(s1).append(" ");
		}
		System.out.println(sb.toString().trim());
		return sb.toString().trim();
        
    }
	public String revervse(String str) {
		int start=0, end=str.length()-1;
		char[] ch = str.toCharArray();
		while(start<end) {
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
		return String.valueOf(ch);
	}
}
