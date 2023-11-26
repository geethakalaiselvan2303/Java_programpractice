package CodeSnipnet;

public class Example1 {
	
	/* Java maintains an internal cache of Integer objects 
	 * -128 to 127
	 * 
	 */
	
	public static void main(String[] args) {
		
		int num1=100;
		int num2=100;
		int num3=500; //-128 to 127
		int num4=500;
		
		if(num1==num2) {
			System.out.println("num1==num2");
		}
		else {
			System.out.println("num1!=num2");
		}
		if(num3==num4) {
			System.out.println("num3==num4");
		}
		else {
			System.out.println("num3!=num4");
		}
	}

}
