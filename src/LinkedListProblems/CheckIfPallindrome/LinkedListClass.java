package LinkedListProblems.CheckIfPallindrome;

public class LinkedListClass {
	
	NodeClass head;
	
	public NodeClass getHead() {
		return head;
	}

	public void setHead(NodeClass head) {
		this.head = head;
	}

	public void AddtoHead(String data) {
		NodeClass node = new NodeClass(data);
		if(head!=null) 
			node.setNext(head);
		head = node;
	}
	
	public String RemoveFromHead() {
		String data = "";
		if(head!=null) {
			data = head.getData();
			head=head.getNext();
			return data;
		}
		return "List is Empty";
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		NodeClass tempHead = head;
		while(tempHead!=null) {
			str.append("=>"+tempHead.getData());
			tempHead=tempHead.getNext();
		}
		return str.toString();
	}
	
	public NodeClass getListInReverse() {
		NodeClass tempHead = head;
		NodeClass newHead = null;
		while(tempHead!=null) {
			NodeClass temp = new NodeClass(tempHead.getData());
			temp.setNext(newHead);
			newHead=temp;
			tempHead=tempHead.getNext();
		}
		return newHead;
	}

public String toString(NodeClass list) {
	StringBuilder str = new StringBuilder();
	while(list!=null) {
		str.append("=>"+list.getData());
		list=list.getNext();
	}
	return str.toString();
}

public String CheckIfPallindrome(NodeClass list, NodeClass list1) {
	while(list!=null) {
		if(list.getData()!=list1.getData())
			return "Not in pallindrome";
		list=list.getNext();
		list1=list1.getNext();
	}
	return "Pallindrome";
}


}
