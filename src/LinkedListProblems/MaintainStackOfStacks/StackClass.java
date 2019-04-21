package LinkedListProblems.MaintainStackOfStacks;
import LinkedListProblems.FindMinInLinkedList.NodeClass;

public class StackClass {
	
	NodeClass head;
	StackClass next;
	public StackClass getNext() {
		return next;
	}

	public void setNext(StackClass next) {
		this.next = next;
	}

	public NodeClass getHead() {
		return head;
	}

	public void setHead(NodeClass node) {
		this.head = node;
	}

	int size=0;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void addToList(int data) {
		NodeClass node = new NodeClass(data);
		if(head!=null)
			node.setNext(head);
		head = node;
		//maintainMin();
		size++;
		
	}

	public int removeFromList()
	{
		if(isEmpty()) 
			return 0;
		int data = head.getData();
		head= head.getNext();
		size--;
		return data;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	/*public void maintainMin() {
		if(minlist==null) {
			minlist = new LinkedList<Integer>();
			minlist.push(head.getData());}
		else if(head.getData()<minlist.peek())
		{	minlist.pop();
				minlist.push(head.getData());}
		
	}
	
	public int getMin() {
		if(minlist==null) 
			return 0;
		return minlist.peek();
	}*/

	@Override
	public String toString() {
		NodeClass head1 =head;
		StringBuilder st = new StringBuilder();
		while(head1!=null) {
			st.append("->"+ head1.getData());
			head1=head1.getNext();
		}
		return st.toString();
	}

}
