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
		System.out.println(list.removeFromTail());
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.searchForDataFromHead("One"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.searchForDataFromHead("Two1"));
		System.out.println(list.searchForDataFromHead("TailOne"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.searchForDataFromTail("One"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.searchForDataFromTail("Two1"));
		System.out.println(list.searchForDataFromTail("TailOne"));
		System.out.println(list.toString());
		System.out.println(list.counter);
/*		System.out.println(list.LocateAndRemoveFromHead("One"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.LocateAndRemoveFromHead("One"));
		System.out.println(list.toString());
		System.out.println(list.counter);*/
		System.out.println(list.LocateAndRemoveFromTail("One"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.LocateAndRemoveFromTail("One"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.LocateAndInsertFromHead("Two","One"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.LocateAndInsertFromHead("TailOne","TailTwo"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.LocateAndInsertFromTail("Three","Four"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.LocateAndInsertFromTail("TailOne","Zero"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.LocateAndRemoveFromTail("Zero"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		
	}
	
}
