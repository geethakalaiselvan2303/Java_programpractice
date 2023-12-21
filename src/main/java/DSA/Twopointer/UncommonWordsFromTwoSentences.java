package DSA.Twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class UncommonWordsFromTwoSentences {
	
	/*  https://leetcode.com/problems/uncommon-words-from-two-sentences/
	 * 
	 *   1. Add the string 1 in the map
	 *   2. Iterate with String 2 and compare with map 
	 *   		check if the map contains the string value and value==1
	 *   	    if yes remove the key from the list
	 * 	 3. Add the left over map value in the list
	 */
	
	//@Test
	public void test_unCommonWords() {
		uncommonFromSentences("this apple is sweet","this apple is sour");
	}
	
	@Test
	public void test_unCommonWords2() {
		String[] uncommonFromSentences = uncommonFromSentences("abcd def abcd xyz","ijk def ijk");
		System.out.println(Arrays.toString(uncommonFromSentences));
	}
	
	public String[] uncommonFromSentences(String s1, String s2) {
		List<String> list=new ArrayList<String>();
		Map<String,Integer> map1=new HashMap<String,Integer>();
		Map<String,Integer> map2=new HashMap<String,Integer>();
		for (String s : s1.split(" ")) {
			map1.put(s, map1.getOrDefault(s, 0)+1);
		}
		for (String s : s2.split(" ")) {
			map2.put(s, map2.getOrDefault(s, 0)+1);
		}
			
		for (Map.Entry<String,Integer> entry : map1.entrySet()) {
			if(entry.getValue()==1 && !map2.containsKey(entry.getKey())) {
				list.add(entry.getKey());
			}
			}
		
		for (Map.Entry<String,Integer> entry : map2.entrySet()) {
			if(entry.getValue()==1 && !map1.containsKey(entry.getKey())) {
				list.add(entry.getKey());
			}
			}
			
		String[] output=new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			output[i]=list.get(i);
		}
			
    	return output;
		
}}