package CodeSnipnet;

public class A {
	 void add() {
	        System.out.println("A - add");
	    }

	    void sub() {
	        System.out.println("A - sub");
	    }
	}

	class B extends A {
	    void add() {
	        System.out.println("B - add");
	    }

	    void mul() {
	        System.out.println("B - mul");
	    }

	    void div() {
	        System.out.println("B - div");
	    }
	

	    public static void main(String[] args) {
	    	/* A ab: This part declares a reference variable named ab of type A.
	    	 *  '= new B();' This part creates a new object of class B using the new keyword. 
	    	 *  The object is instantiated from class B and allocated memory in the heap. 
	    	    However, the reference variable ab is of type A, 
	    	    which is the superclass of B. This is an example of polymorphism in Java.
	    	 *  
	    	 *  
	    	 *  A ab = new B();, you are creating an object of class B but storing its reference in a variable of type A. 
	    	    This means you can access only the methods and properties that are defined in class A using the ab variable.
	    	    If class B overrides methods from class A, the overridden methods in B will be called at runtime 
	    	    when invoked through the ab variable,demonstrating polymorphic behavior.
	    	 *  
	    	 *  
	    	 */
	    	
	    	
	        B ab = new B();
	        ab.add(); // Output: B - add
	        ab.sub(); // Output: A - sub
	        ab.mul(); // Error: The method mul() is undefined for the type A
	        ab.div(); // Error: The method div() is undefined for the type A

//	         B ba = new A(); // Error: Cannot instantiate the type A
	    }
	}


