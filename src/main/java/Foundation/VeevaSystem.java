package Foundation;

public class VeevaSystem {

	public static void main(String[] args) {
		String s="Tamil Elavenil";
		char[] ch = s.toCharArray();
		for (int i = 1; i < ch.length; i=i+2) {
			if(Character.isAlphabetic(ch[i])) {
				ch[i]='@';
			}
		}
		System.out.println(String.valueOf(ch));
	}
}
