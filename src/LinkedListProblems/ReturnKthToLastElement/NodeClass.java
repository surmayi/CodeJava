package LinkedListProblems.ReturnKthToLastElement;

public class NodeClass {
	
	private String data ;
	private NodeClass next;
	
	public NodeClass(String data) {
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
