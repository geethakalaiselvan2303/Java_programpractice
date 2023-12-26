package DSA.SlidingWindow;

public class CharacterSeuence {
	
	public static void main(String[] args) {
		String str="AaabBcCaA";
		String result="";
		char[] ch = str.toCharArray();
		int left=0,right=1;
		while(right<str.length()) {
			if(Character.toLowerCase(ch[left])==Character.toLowerCase(ch[right])) {
				right++;
			}
			else {
				result=result+ch[left]+""+(right-left);
				left=right;
			}
			
		}
		result=result+ch[left]+""+(right-left);
		System.out.println(result);
	}

}
