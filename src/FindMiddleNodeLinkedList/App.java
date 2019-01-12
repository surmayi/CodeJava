package FindMiddleNodeLinkedList;

public class App {

	public static void main(String[] args) {
		
		LinkedListHelper list = new LinkedListHelper();
		list.InsertInList("One");
		list.InsertInList("Two");
		list.InsertInList("Three");
		list.InsertInList("Four");
		list.InsertInList("Five");
		//list.InsertInList("Six");
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.FindMidElement());
	}

}
