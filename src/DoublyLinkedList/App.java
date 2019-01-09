package DoublyLinkedList;


public class App {

	public static void main(String[] args) {
		
		DoublyLinklistClass list = new DoublyLinklistClass();
		list.addToListFromHead("One");
		list.addToListFromHead("Two");
		System.out.println(list.toString());
		System.out.println(list.counter);
		list.addToListFromHead("Three");
		list.addToListFromHead("Four");
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.removeFromHead());
		System.out.println(list.toString());
		System.out.println(list.counter);
		list.addToTail("TailOne");
		list.addToTail("TailTwo");
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.removeFromHead());
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.removeFromTail());
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.removeFromTail());
		System.out.println(list.toString());
		System.out.println(list.counter);
		
	}
	
}
