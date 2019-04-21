package LinkedListProblems.MaintainStackOfStacks;


public class ArrayListStackClass {

	StackClass headStack ;
	
	int capacity =10;
	
	public void addToStack(int data) {
		if(headStack==null) {
			headStack = new StackClass();
			}
		if(headStack.getSize()==3) {
			StackClass newHead = new StackClass();
				newHead.addToList(data);
				newHead.setNext(headStack);
				headStack = newHead;
		}
		else
			headStack.addToList(data);
		
	}
	
	public int removeFromStack() {
		if(headStack==null)
		return 0;
		else 
			if(headStack.getSize()==1) {
				int data = headStack.removeFromList();
				if(headStack.getNext()!=null) 
					headStack = headStack.getNext();
				return data;
			}	
		else {
			int data = headStack.getHead().getData();
			headStack.setHead(headStack.getHead().getNext());
			headStack.size--;
			return data;
			}
		}	
	
	public String toString() {
		String st = "";
		StackClass head1 = headStack;
		while(head1!=null) {
			while(head1.getHead()!=null) {
				st=st+"->"+head1.getHead().getData();
				head1.head = head1.head.getNext();
			}
				st=st+"\n";
				head1 =head1.getNext();
		}
		return st;
	}
}
