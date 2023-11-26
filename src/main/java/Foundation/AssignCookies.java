package Foundation;

import java.util.Arrays;

import org.junit.Test;

public class AssignCookies {
	
	/* https://leetcode.com/problems/assign-cookies/
	 * 
	 *  1. Declare 2 pointer. ptr1 for children ptr2 for cookies
	 *  2. start with condition  
	 */
	
	@Test
	public void test1() {
		findContentChildren(new int[] {10,9,8,7},new int[] {5,6,7,8});
	} 
	public int findContentChildren(int[] g, int[] s) {
		int i=0,j=0,count=0;
		Arrays.sort(g); //7,8,9,10
		Arrays.sort(s); // 5,6,7,8
		while(i<g.length && j<s.length) {
			if(s[j] >= g[i]) {
				i++;
				count++;
			}
			
				j++;
		}
		System.out.println(count);
		return count;
        
    }
}
