package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class RingsAndRods {
	
	/* https://leetcode.com/problems/rings-and-rods/*/

	@Test
	public void test() {
		countPoints("B0B6G0R6R0R6G9");
	}
	
	public int countPoints(String rings) {
		int count=0;
		Map<Integer,Set<Character>> map=new HashMap<Integer,Set<Character>>();
		for (int i = 0; i < rings.length(); i++) {
			int key=rings.charAt(i+1);
			char value=rings.charAt(i);
			if(map.containsKey(key)) {
				Set<Character> set=new HashSet<Character>();
				set.add(value);
				map.put(key, set);
			}
			else {
				Set<Character> set2=map.get(key);
				set2.add(value);
				map.put(key, set2);
			}
		}
		for (Map.Entry<Integer,Set<Character>> entry : map.entrySet()) {
			Set<Character> value = entry.getValue();
			if(value.size()==3) {
				count++;
			}
		}
		return count;
	        
	    }
}
