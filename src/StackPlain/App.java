package StackPlain;

public class App {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack();
		stack.popFromStack();
		stack.pushToStack(new Employee("One",25));
		stack.pushToStack(new Employee("Two",26));
		System.out.println(stack.toString());
		System.out.println(stack.top.name+stack.top.age);
		stack.pushToStack(new Employee("Three",27));
		stack.pushToStack(new Employee("Four",28));
		System.out.println(stack.toString());
		System.out.println(stack.top.name+stack.top.age);
		
		stack.popFromStack();
		System.out.println(stack.top.name+stack.top.age);
		System.out.println(stack.toString());

	}

}
