package FindMiddleNodeLinkedList;

public class LinkedListHelper {
	
	NodeClass head;
	int counter=0;
	
	public void InsertInList(String data) {
		NodeClass newNode = new NodeClass(data);
		if(head!=null)
			newNode.setNexNode(head);
		head=newNode;
		 counter++;
		}
	
	public String RemoveFromList() {
		String data="";
		if(head!=null) {
			data = head.getData();
			head = head.getNexNode();
			counter--;
			return data;
		}
		return "List is empty";
	}
	
	public String toString() {
		String list = "";
		NodeClass tempHead = head;
		while(tempHead!=null)
		{
			list+=tempHead.getData()+"=>";
			tempHead=tempHead.getNexNode();
		}
		return list;
	}
	
	public String FindMidElement() {
		NodeClass tempHead1 = head, tempHead2 = head;
		while( tempHead2!=null&&tempHead2.getNexNode()!=null ) {
			tempHead1= tempHead1.getNexNode();
			tempHead2 = tempHead2.getNexNode().getNexNode();
		}
		return tempHead1.getData();
	}

}
