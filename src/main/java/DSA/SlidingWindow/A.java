package DSA.SlidingWindow;

public class A {
	void m1(){
		System.out.println("class A m1");
	}
	void m2(){
		System.out.println("class A m2");
	}
	void m3(){
		System.out.println("class A m3");
	}
	class B extends A{
		void m1(){
			System.out.println("class b m1");
		}
		void m2(){
			System.out.println("class b m2");
		}
		void m3(){
			System.out.println("class b m3");
		}
		void m4(){
			System.out.println("class b m4");
		}
	}
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		a.m1();
		a.m1();
	}
}
