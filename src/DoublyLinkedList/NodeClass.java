package DoublyLinkedList;

public class NodeClass {
	
	String data;
	NodeClass next,prev;
	
	public NodeClass getPrev() {
		return prev;
	}

	public void setPrev(NodeClass prev) {
		this.prev = prev;
	}

	NodeClass(String data){
		this.data=data;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public NodeClass getNext() {
		return next;
	}
	public void setNext(NodeClass next) {
		this.next = next;
	}

}
