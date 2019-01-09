package adt;

/**
 * @author surmayi.shree
 *
 */
public class Counter {
	
	int i;
	String name;
	
	public Counter(String name) {
		this.name = name;
	}
	
	public void increment() {
		this.i++;
	}
	
	public int getCurrentValue() {
		return this.i;
	}
	
	@Override
	public String toString() {
		return String.valueOf(i)+name;
	}

}
