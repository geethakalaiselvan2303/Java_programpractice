package HashMap;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FirstUniqueCharacterString {
	
	/* https://leetcode.com/problems/first-unique-character-in-a-string/
	 */

	@Test
	public void test1() {
		int firstUniqueCharacterString = FirstUniqueCharacterString("leetcode");
		System.out.println(firstUniqueCharacterString);
	}

	@Test
	public void test2() {
		int firstUniqueCharacterString = FirstUniqueCharacterString2("leetcode");
		System.out.println(firstUniqueCharacterString);
	}
	public int FirstUniqueCharacterString2(String s) {
		 for (int i = 0; i < s.length(); i++) {
		        char currentChar = s.charAt(i);
		        if (s.indexOf(currentChar) == s.lastIndexOf(currentChar)) {
		            return i;
		        }
		    }
		    return -1;
	}

	public int FirstUniqueCharacterString(String s) {
		int index = -1;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			int value=map.getOrDefault(s.charAt(i), 0);
			map.put(s.charAt(i),  (value+ 1));
		}
		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1) {
				index = i;
				break;
			}
		}
		return index;
}
}