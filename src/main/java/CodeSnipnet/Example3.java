package CodeSnipnet;

class Example3 {
	int i;
	int j;

	Example3(int i) {
		this.i = i;
	}

	Example3(int i, int j) {
		this.i = i;
	}

	public static void main(String args[]) {
			// this will throw error as we have parameterized constructor in our class
			Example3 a = new Example3(); 
		    Example3 a1 = new Example3(10);
		}

}
