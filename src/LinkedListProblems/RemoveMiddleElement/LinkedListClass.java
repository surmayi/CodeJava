package LinkedListProblems.RemoveMiddleElement;

public class LinkedListClass {
	
	NodeClass head;
	int counter;
	
	public void addToHead(String data) {
		NodeClass node = new NodeClass(data);
		if(head!=null) 
			node.setNext(head);
		head = node;
		counter++;
	}
	
	public String RemoveFromHead() {
		if(head!=null)
		{
			String data = head.getData();
			head = head.getNext();
			return data;
		}
		return "List is Empty";
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		NodeClass tempNode = head;
		while(tempNode!=null) {
			str.append("=>"+tempNode.getData());
			tempNode=tempNode.getNext();}
		if(str.length()>0)
		return str.toString();
		return "List is Empty";
	}
	
	public String RemoveMiddleElement() {
		NodeClass slow=head, fast=head, prev=head;
		while(fast!=null &&fast.getNext()!=null) {
			prev= slow;
			slow=slow.getNext();
			fast= fast.getNext().getNext();
		}
		prev.setNext(slow.getNext());
		return slow.getData();
	}

}
