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

	//@Test
	public void testAnagram() {
		List<List<String>> anagram = anagram(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});
		List<List<String>> expectedAnagram = Arrays.asList(
                Arrays.asList("eat", "tea", "ate"),
                Arrays.asList("bat"),
                Arrays.asList("tan", "nat")               
        );
		Assert.assertEquals(anagram,expectedAnagram);
	}
	
	@Test
	public void testAnagram1() {
		List<List<String>> anagram = groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});
		List<List<String>> expectedAnagram = Arrays.asList(
                Arrays.asList("eat", "tea", "ate"),
                Arrays.asList("bat"),
                Arrays.asList("tan", "nat")               
        );
		Assert.assertEquals(anagram,expectedAnagram);
	}


	//1->[eat,tea,ate]
	
	private List<List<String>> anagram(String[] s) {
		Map<String,List<String>> map=new HashMap<String,List<String>>();
		for(String s1:s) {
			char[] charArray = s1.toCharArray();
			Arrays.sort(charArray);
			 
//			String charToString =new String(charArray);
			String str = String.valueOf(charArray); //aet
			if(!map.containsKey(str)) {
				map.put(str, new ArrayList<String>());
			}
			
			map.get(str).add(s1);
			
		}
		System.out.println(new ArrayList<List<String>>(map.values()));
		return new ArrayList<List<String>>(map.values());
	  }
	
	 public List<List<String>> groupAnagrams(String[] strs) {
	       	Map<String,List<String>> map=new HashMap<String,List<String>>();
			for (String s : strs) {
				char[] ch = s.toCharArray();
				Arrays.sort(ch);
				String key = String.valueOf(ch); //aet->eat
				if(!map.containsKey(key)) { //aet
					List<String> list1=new ArrayList<String>();
					list1.add(s); //eat
					map.put(key,list1);//aet-->eat
				}
				else {
					List<String> existingList = map.get(key);//eat
					existingList.add(s);//tea
				    map.put(key, existingList);
								}
			}
			return new ArrayList<>(map.values()); 
	    }
	
}
