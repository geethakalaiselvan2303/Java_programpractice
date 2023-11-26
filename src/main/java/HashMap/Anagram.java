package HashMap;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class Anagram {
	
	/* Given two strings, check if they are anagrams of each other.
	String str1 = "listen";
	String str2 = "silent";
	// Output: true
	 * 
	 */

	@Test
	public void testAnagram() {
		boolean anagram = anagram("listen","silent");
		Assert.assertEquals(anagram, true);
	}

	@Test
	public void testAnagram_2() {
		boolean anagram = anagram("listen","client");
		Assert.assertEquals(anagram, false);
	}
	
	private boolean anagram(String s1, String s2) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c: s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char c1: s2.toCharArray()) {
			if(map.containsKey(c1) && map.get(c1)>1) {
				map.put(c1, map.getOrDefault(c1, 0)-1);
			}
			else {
				map.remove(c1);
			}
		}
		return map.size()==0;
	  }
	
	
	
}
