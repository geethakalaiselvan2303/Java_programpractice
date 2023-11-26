package HashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class LongestSubstringwithoutRepeatingCharacters {

	/*   5. Longest Substring without Repeating Characters:
			Given a string, find the length of the longest substring without repeating characters.
			String input = "abcabcbb";
			// Output: 3 (for "abc") // two pointer with hashMap
	 * 
	 */
	
	
	@Test
	public void testLongSub() {
		int subString = subString("abcabcbb");
		Assert.assertEquals(subString, 3);
	}
	
	@Test
	public void testLongSub1() {
		int subString = subString("abcabcefghbb");
		Assert.assertEquals(subString, 7);
	}

	public int subString(String s) {
		int left=0,right=0;
		int max=Integer.MIN_VALUE;
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		while(right<s.length()) {
			if(map.containsKey(s.charAt(right))) {
				max=Math.max(max, right-left);
				map.clear();
				left=right;
			}
			else {
				map.put(s.charAt(right++), 1);
			}
		}
		return max;
	}
}
