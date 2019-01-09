package SinglyLinkedListCRUD;

public class App {

	public static void main(String[] args) {
		
		LinklistClass list = new LinklistClass();
		list.addToList("One");
		list.addToList("Two");
		System.out.println(list.toString());
		System.out.println(list.counter);
		list.addToList("Three");
		list.addToList("Four");
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.removeFromList());
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.SearchForData("Three1"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.SearchForData("Two"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.SearchForDataAndRemove("Two"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.SearchForDataAndRemove("Two"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.MoveAndInsertInMid("Three", "Two"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		list.addToList("Four");
		System.out.println(list.toString());
		System.out.println(list.counter);
		list.addToList("Six");
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.MoveAndInsertInMid("Six", "Five"));
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.MoveAndInsertInMid("One", "Zero"));
		System.out.println(list.toString());
		System.out.println(list.counter);
	}
	

}
