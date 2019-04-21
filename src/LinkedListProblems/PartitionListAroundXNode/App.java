package LinkedListProblems.PartitionListAroundXNode;

public class App {

	public static void main(String[] args) {
		LinkedListClass list = new LinkedListClass();
		list.addtoHead(10);
		list.addtoHead(1);
		list.addtoHead(6);
		list.addtoHead(5);
		list.addtoHead(2);
		list.addtoHead(4);
		list.addtoHead(11);
		list.addtoHead(19);
		System.out.println(list.toString());
		System.out.println(list.PartitionAroundXElement(5));
		

	}

}
