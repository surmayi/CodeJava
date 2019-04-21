package LinkedListProblems.FindMinInLinkedList;

import java.util.LinkedList;

public class LinkedListClass {
	
	NodeClass head;
	LinkedList<Integer> minlist;
	int size=0;
	
	public void addToList(int data) {
		NodeClass node = new NodeClass(data);
		if(head!=null)
			node.setNext(head);
		head = node;
		maintainMin();
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
	
	public void maintainMin() {
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
	}

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
