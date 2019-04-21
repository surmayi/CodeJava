package LinkedListProblems.FindMinInLinkedList;

public class App {

	public static void main(String[] args) {
		LinkedListClass list = new LinkedListClass();
		list.addToList(10);
		list.addToList(5);
		list.addToList(2);
		list.addToList(10);
		
		System.out.println(list.toString());
		System.out.println(list.getMin());

	}

}
