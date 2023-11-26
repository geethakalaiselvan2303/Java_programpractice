package CodeSnipnet;

public class Test1 {

	static int x=10;
	int y=20;
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.x=999;
		t1.y=888;
		Test1 t2=new Test1();
		System.out.println(t2.x + ""+ t2.y);
	}
}
