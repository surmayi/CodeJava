package SinglyLinkedListCRUD;

public class NodeClass {
	
	String dataNode;
	NodeClass nextNode;
	
	NodeClass(String data){
		this.dataNode = data;
	}
	
	public String getDataNode() {
		return dataNode;
	}
	public void setDataNode(String dataNode) {
		this.dataNode = dataNode;
	}
	public NodeClass getNextNode() {
		return nextNode;
	}
	public void setNextNode(NodeClass nextNode) {
		this.nextNode = nextNode;
	}
	

}
