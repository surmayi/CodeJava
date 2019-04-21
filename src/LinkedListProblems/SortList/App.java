package LinkedListProblems.SortList;

public class App {

	public static void main(String[] args) {
		
		LinklistClass list = new LinklistClass();
		list.addToList(12);
		list.addToList(13);
		list.addToList(5);
		list.addToList(10);
		list.addToList(1);
		
		System.out.println(list.SortList());
	}

}
