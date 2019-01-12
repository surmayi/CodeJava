package LinkedListProblems.Add2ListWithDigitsAsNodes;

public class App {

	public static void main(String[] args) {
		
		LinkedListClass list = new LinkedListClass();
		
		list.AddtoHead(6);
		list.AddtoHead(1);
		list.AddtoHead(2);
		int l1 =list.ConvertListToNumber(list);
		
		LinkedListClass list1 = new LinkedListClass();
		
		list1.AddtoHead(0);
		list1.AddtoHead(0);
		list1.AddtoHead(0);
		list1.AddtoHead(9);
		int l2 = list1.ConvertListToNumber(list1);

		System.out.println(l1+l2);
	}

}
