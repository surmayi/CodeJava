package LinkedListProblems.RemoveDuplicates;

public class App {

	public static void main(String[] args) {
		
		LinkedListClass list = new LinkedListClass();
		list.addtoHead("One");
		list.addtoHead("Two");
		list.addtoHead("One");
		list.addtoHead("Three");
		list.addtoHead("Four");
		list.addtoHead("Four");
		list.addtoHead("Four");
		System.out.println(list.toString());
		System.out.println(list.removeDuplicates());
		System.out.println(list.toString());
		list.addtoHead("Four");
		System.out.println(list.toString());
		System.out.println(list.removeDuplicates());
		System.out.println(list.toString());

	}

}
