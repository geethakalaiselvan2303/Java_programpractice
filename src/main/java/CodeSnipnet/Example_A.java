package CodeSnipnet;

/* if you want to access non-static variables within a static method, you need to create an instance
 *  of the class and use that instance to access the non-static variables. 
 * 
 */

public class Example_A {
	int v;
	public static int getv()
	{
		Example_A obj =new Example_A();
		return obj.v=10;
	}

	public static void main(String args[])
	{
	
	}
}
