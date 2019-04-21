package LinkedListProblems.Add2ListWithDigitsAsNodes;

public class NodeClass {
	
	private int data;
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
	
	public NodeClass(int data) {
		this.data= data;
	}
	

}
