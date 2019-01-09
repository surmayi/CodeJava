package adt;

public class testing {

	public static void main(String[] args) {
		
		Counter c = new Counter("Surmayi");
		System.out.println(c.toString());
		c.increment();
		System.out.println(c.toString());
		c.increment();
		c.increment();
		c.increment();
		c.increment();
		System.out.println(c.toString());
	}

}
