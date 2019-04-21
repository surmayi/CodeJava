package LinkedListProblems.ImplementQueueUsing2Stacks;

public class App {

	public static void main(String[] args) {
		StackHelper list = new StackHelper();
		list.addToRear(10);
		list.addToRear(5);
		list.addToRear(2);
		list.addToRear(10);
		list.addToRear(11);
		
		System.out.println(list.toString());
		System.out.println(list.removeFromFront());
		System.out.println(list.toString());
		System.out.println(list.removeFromFront());
		System.out.println(list.toString());
	}

}
