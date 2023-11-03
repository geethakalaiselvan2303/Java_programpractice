package Foundation;

import org.junit.Test;
import org.testng.Assert;

public class ReverseString_II {
	
	/*https://leetcode.com/problems/reverse-string-ii/description/
	 * 
	 */
	
	@Test
	public void test1() {
		String reverseStr = reverseStr("abcdefg",2);
		Assert.assertEquals(reverseStr, "bacdfeg");
	}
	
	public String reverseStr(String s, int k) {
		     int start = 0;
		    int end = 0;
		    int i = 0;
		    char[] ch = s.toCharArray();
		    while (start < s.length()) {
		        start = i;
		        end = i + k - 1;
		        if (end >= s.length()) {
		            end = s.length() - 1;
		        }
		       reverse(ch, start, end);
		        i = i + 2 * k;
		    }
		    
		    String str = new String(ch);
		    return str;
			}

			public String reverse(char[] ch, int start, int end) {
				while(start<end) {
				char temp=ch[start];
				ch[start]=ch[end];
				ch[end]=temp;
				start++;
				end--;
				}
				return String.valueOf(ch);
			} 
		    
		}