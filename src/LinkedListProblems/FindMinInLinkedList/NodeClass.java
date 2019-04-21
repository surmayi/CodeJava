package LinkedListProblems.FindMinInLinkedList;

public class NodeClass {
	
	int data;
	NodeClass next;
	
	public NodeClass(int data) {
		this.data= data;
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

	@Override
	public String toString() {
		return data+"->"+ next.getData();
	}
}
