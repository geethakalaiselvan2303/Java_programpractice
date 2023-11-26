package DSA.Twopointer;

public class Test {
	
	public abstract class MyAbstractClass {

	    public abstract void a();
	    public abstract void b();
	}


	public class Foo extends MyAbstractClass {

	    public void a() {
	        System.out.println("hello");
	    }

		@Override
		public void b() {
			// TODO Auto-generated method stub
			
		}

	  
	}


	public class Bar extends MyAbstractClass {

	    public void a() {
	        System.out.println("hello");
	    }

	    public void delta() {
	        System.out.println("gamma");
	    }

		@Override
		public void b() {
			// TODO Auto-generated method stub
			
		}
	}

}
