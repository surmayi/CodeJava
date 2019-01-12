package LinkedListProblems.ReturnKthToLastElement;

public class App {

	public static void main(String[] args) {
		
		LinkedListClass list = new LinkedListClass();
		list.AddtoHead("1");
		list.AddtoHead("2");
		list.AddtoHead("3");
		list.AddtoHead("4");
		list.AddtoHead("5");
		list.AddtoHead("6");
		System.out.println(list.toString());
		System.out.println(list.counter);
		System.out.println(list.PrintFromKthElement(3));
		System.out.println(list.PrintFromKthElement(5));
		System.out.println(list.PrintFromKthElement(7));

	}

}
