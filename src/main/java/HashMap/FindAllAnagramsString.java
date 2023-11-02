package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class FindAllAnagramsString {
	
	/*
	 * https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
	 *  1. Declare the variable pointer as 0;
	*/
	
	@Test
	public void test1() {
		findAnagrams("cbaebabacd","abc");
	}
	@Test
	public void test2() {
		findAnagrams("baa","aa");
	}

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> list=new ArrayList<Integer>();
		Map<Character,Integer> sMap=new HashMap<Character,Integer>();
		Map<Character,Integer> pMap=new HashMap<Character,Integer>();
		int k=p.length(),pointer=0;
		if (s.length() < p.length()) {
        return list; 
    }
		for(char c1:p.toCharArray()) {
			int value = pMap.getOrDefault(c1, 0);
			pMap.put(c1, (value+1));
		}
		
		while(pointer<k) {
    int value = sMap.getOrDefault(s.charAt(pointer), 0);
    sMap.put(s.charAt(pointer++), (value+1));
		
}
		int start = pointer - k;
		if(isAnagram(pMap,sMap)) {
			list.add(start);
		}
		while(pointer<s.length()) {
			char c = s.charAt(pointer-k);
			int val = sMap.getOrDefault(c, 0);
			if(val>1) {
				sMap.put(c, val-1);
			}
			else {
				sMap.remove(c);
			}
			int orDefault = sMap.getOrDefault(s.charAt(pointer), 0);
			sMap.put(s.charAt(pointer++),(orDefault+1));
			if(isAnagram(pMap,sMap)) {
				list.add(pointer-k);
			}
		
		}
		System.out.println(list);
		return list;
			
		}

	public boolean isAnagram(Map<Character, Integer> pMap, Map<Character, Integer> sMap) {
	for (Map.Entry<Character, Integer> entry : pMap.entrySet()) {
        char p_key = entry.getKey();
        int p_value = entry.getValue();
        int s_value = sMap.getOrDefault(p_key, 0); // Use getOrDefault to handle null values
        if (p_value != s_value) {
            return false;
        }
    }
    return true;
	}
	    }
	
	



