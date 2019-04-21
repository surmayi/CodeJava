package LinkedListProblems.CheckIfPallindrome;

public class App {

	public static void main(String[] args) {
		
		LinkedListClass list =new LinkedListClass();
		list.AddtoHead("One");
		list.AddtoHead("Two");
		list.AddtoHead("Three");
		list.AddtoHead("Two");
		list.AddtoHead("One");
		System.out.println(list.toString());
		NodeClass list1 = list.getListInReverse();
		System.out.println(list.CheckIfPallindrome(list.getHead(),list1));
		System.out.println(list1.toString());
		
	}
	
}
