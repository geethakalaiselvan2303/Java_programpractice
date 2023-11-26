package HashMap;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class RansomNoteMagazine {
	
	@Test
	public void testMagazineRansome() {
		boolean ransomNoteMagazine = ransomNoteMagazine("aabb","aabbc");
		Assert.assertEquals(ransomNoteMagazine, true);
	}
	
	@Test
	public void testMagazineRansome1() {
		boolean ransomNoteMagazine = ransomNoteMagazine("geetha","geetakjkl");
		Assert.assertEquals(ransomNoteMagazine, false);
	}

	@Test
	public void testMagazineRansome_Ascii() {
		boolean ransomNoteMagazine = ransomNoteMagazine_Ascii("aabb","aabbc");
		Assert.assertEquals(ransomNoteMagazine, true);
	}
	
	@Test
	public void testMagazineRansome1_Ascii() {
		boolean ransomNoteMagazine = ransomNoteMagazine_Ascii("geetha","geetakjkl");
		Assert.assertEquals(ransomNoteMagazine, false);
	}
	
	
	public boolean ransomNoteMagazine_Ascii(String ransomNote, String magazine) {
		int[] freqArray=new int[26];
		
		for (int i = 0; i < ransomNote.length(); i++) {
			char ch = ransomNote.charAt(i);
			freqArray[ch-'a']++;
		}
		for (int j = 0; j < magazine.length(); j++) {
			char ch = magazine.charAt(j);
			if(freqArray[ch-'a']>0) {
			freqArray[ch-'a']--;}
		}
        for (int i = 0; i < freqArray.length; i++) {
            if (freqArray[i] > 0) {
                return false;
            }
	}
        return true;
	}

	public boolean ransomNoteMagazine(String ransomNote, String magazine) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c: ransomNote.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char c1: magazine.toCharArray()) {
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


