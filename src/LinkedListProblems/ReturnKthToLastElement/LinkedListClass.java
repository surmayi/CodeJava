package LinkedListProblems.ReturnKthToLastElement;

public class LinkedListClass {
	
	NodeClass head;
	int counter;
	
	public void AddtoHead(String data) {
		NodeClass node = new NodeClass(data);
		if(head!=null) 
			node.setNext(head);
		head = node;
		counter++;
	}
	
	public String RemoveFromHead() {
		String data ="";
		if(head!=null) {
			data = head.getData();
			head =head.getNext();
			return data;
		}
		return "List is Empty";
	}
	
	public String toString(NodeClass node) {
		StringBuilder list = new StringBuilder();
		while(node!=null) {
			list.append("=>"+ node.getData());
			node=node.getNext();
		}
		return list.toString();
	}
	
	@Override
	public String toString() {
		NodeClass node =head;
		StringBuilder list = new StringBuilder();
		while(node!=null) {
			list.append("=>"+ node.getData());
			node=node.getNext();
		}
		return list.toString();
	}
	
	public String PrintFromKthElement(int k) {
		int i=1;
			NodeClass tempHead = head;
			while(i<k) {
				i++;
				tempHead=tempHead.getNext();
			}
			if(tempHead!=null)
			return toString(tempHead);
			else
				return "List is Empty";
	}

}
