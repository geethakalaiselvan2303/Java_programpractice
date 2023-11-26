package HashMap;

public class Parentt {
	String name;
	String sex;
	int age;
	
	public Parentt(String s) {
		name=s;
	}

	public Parentt(String s,int n) {
		sex=s;
		age=n;
	}

	public static void main(String[] args) {
		Parentt p=new Parentt("geteha");
		Parentt p1=new Parentt("geteha",35);
		System.out.println("print : "+p.name);
		Thread.sleep(0);
	}

}
