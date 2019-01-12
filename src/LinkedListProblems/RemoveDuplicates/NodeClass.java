package LinkedListProblems.RemoveDuplicates;

public class NodeClass {
	
	String data;
	NodeClass nextNode;
	
	public NodeClass(String data) {
		this.data=data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public NodeClass getNextNode() {
		return nextNode;
	}

	public void setNextNode(NodeClass nextNode) {
		this.nextNode = nextNode;
	}

}
