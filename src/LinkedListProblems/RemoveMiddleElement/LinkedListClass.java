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
		NodeClass head1=head,head2=head, prev=head;
		while(head2!=null && head2.getNext()!=null) {
			prev=head1;
			head1=head1.getNext();
			head2=head2.getNext().getNext();
		}
		prev.setNext(prev.getNext().getNext());
			return toString();
	}

}
