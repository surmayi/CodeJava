package DoublyLinkedList;

public class DoublyLinklistClass {
	
	NodeClass head;
	NodeClass tail;
	int counter=0;
	
	public void addToListFromHead(String data) {
		NodeClass node = new NodeClass(data);
		if(head!=null) {
			node.setNext(head);
			head.setPrev(node);
			head=node;
		}
		else
		{
			head = tail = node;	
		}
		counter++;
	}
	
	public void addToTail(String data) {
		NodeClass node = new NodeClass(data);
		if(tail!=null) {
			node.setPrev(tail);
			tail.setNext(node);
			tail = node;
		}
		else {
			head = tail=node;}
		counter++;
	}
	
	public int getLength() {
		return counter;
	}
	
	public String removeFromHead() {
		if(head!=null) {
		String data = head.data;
		head= head.getNext();
		head.setPrev(null); 
		counter--;
		return data;}
		else
			return "NO DATA IN LIST FROM HEAD";
	}
	
	public String removeFromTail() {
		if(tail!=null) {
			String data = tail.data;
			tail=tail.getPrev();
			if(tail!=null)
			tail.setNext(null); counter--;
			return data;
		}
		else return "NO DATA IN LIST FROM TAIL";
	}
	
	@Override
	public String toString() {
		String data="";
		NodeClass tmpHead = head;
		while(tmpHead!=null) {
			data=data+tmpHead.data+"=>";
			tmpHead=tmpHead.next;
		}
		return data;
	}
}
