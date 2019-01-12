package LinkedListProblems.RemoveMiddleElement;

public class App {

	public static void main(String[] args) {
		
		LinkedListClass list = new LinkedListClass();
		list.addToHead("1");
		list.addToHead("2");
		list.addToHead("9");
		list.addToHead("4");
		list.addToHead("5");
		list.addToHead("6");
		list.addToHead("7");
		System.out.println(list.toString());
		System.out.println("Removed Node"+list.RemoveMiddleElement());
		System.out.println(list.toString());
		System.out.println("Removed Node"+list.RemoveMiddleElement());
		System.out.println(list.toString());
		System.out.println("Removed Node"+list.RemoveMiddleElement());
		System.out.println(list.toString());
	}

}
