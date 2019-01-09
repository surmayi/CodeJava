package Queue;

public class App {

	public static void main(String[] args) {
		
		QueuePlain queue = new QueuePlain();
		queue.pushToQueue("One");
		queue.pushToQueue("Two");
		System.out.println(queue.toString());
		System.out.println(queue.getHead()+" : "+ queue.getTail());
		
		queue.pushToQueue("Three");
		queue.pushToQueue("Four");
		System.out.println(queue.toString());
		System.out.println(queue.getHead()+" : "+ queue.getTail());
		
		System.out.println(queue.popFromQueue());
		System.out.println(queue.toString());
		System.out.println(queue.getHead()+" : "+ queue.getTail());
		System.out.println(queue.popFromQueue());
		System.out.println(queue.toString());
		System.out.println(queue.getHead()+" : "+ queue.getTail());
		System.out.println(queue.popFromQueue());
		System.out.println(queue.toString());
		System.out.println(queue.getHead()+" : "+ queue.getTail());
		System.out.println(queue.popFromQueue());
		System.out.println(queue.toString());
		System.out.println(queue.getHead()+" : "+ queue.getTail());
		
	}

}
