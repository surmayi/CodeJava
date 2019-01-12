package LinkedListProblems.PartitionListAroundXNode;

public class NodeClass {
	
	private int data;
	public NodeClass(int data) {
		this.data =data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public NodeClass getNext() {
		return next;
	}

	public void setNext(NodeClass next) {
		this.next = next;
	}

	private NodeClass next;
	

}
