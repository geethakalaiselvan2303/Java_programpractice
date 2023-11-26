package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class GroupAnagram {
	
	/* Given an array of strings, group anagrams together.
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		// Output: {{"bat"},{"nat","tan"},{"ate","eat","tea"}}
	 * 
	 */

	@Test
	public void testAnagram() {
		List<List<String>> anagram = anagram(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});
		List<List<String>> expectedAnagram = Arrays.asList(
                Arrays.asList("eat", "tea", "ate"),
                Arrays.asList("bat"),
                Arrays.asList("tan", "nat")               
        );
		Assert.assertEquals(anagram,expectedAnagram);
	}

	
	private List<List<String>> anagram(String[] s) {
		Map<String,List<String>> map=new HashMap<String,List<String>>();
		for(String s1:s) {
			char[] charArray = s1.toCharArray();
			Arrays.sort(charArray);
			 
//			String charToString =new String(charArray);
			String str = String.valueOf(charArray);
			if(!map.containsKey(str)) {
				map.put(str, new ArrayList<String>());
			}
			
			map.get(str).add(s1);
			
		}
		System.out.println(new ArrayList<List<String>>(map.values()));
		return new ArrayList<List<String>>(map.values());
	  }
	
	
	
}
