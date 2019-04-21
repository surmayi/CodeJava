package LinkedListProblems.MaintainStackOfStacks;

public class App {

	public static void main(String[] args) {
		
		ArrayListStackClass list = new ArrayListStackClass();
		list.addToStack(1);
		list.addToStack(2);
		list.addToStack(3);
		list.addToStack(4);
		list.addToStack(5);
		list.addToStack(6);
		list.addToStack(7);
		list.addToStack(8);
		list.addToStack(9);
		list.addToStack(10);
		
		System.out.println(list.toString());
		
		System.out.println(list.removeFromStack());
		System.out.println(list.toString());
	}

}
