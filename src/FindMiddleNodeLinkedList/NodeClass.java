package FindMiddleNodeLinkedList;

public class NodeClass {
	
	String data;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	NodeClass nexNode;
	public NodeClass getNexNode() {
		return nexNode;
	}
	public void setNexNode(NodeClass nexNode) {
		this.nexNode = nexNode;
	}
	
	public NodeClass(String data) {
		this.data=data;
	}

}
