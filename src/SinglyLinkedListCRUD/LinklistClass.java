package SinglyLinkedListCRUD;

public class LinklistClass {

	NodeClass head ;
	int counter=0;
	
	public void addToList(String data) {
		
		NodeClass temp = new NodeClass(data);
		if(head!=null)
		temp.setNextNode(head);
		head = temp;
		counter++;
			
	}
	
	public int getLength() {
		return counter;
	}
	
	public String removeFromList() {
		String data = head.dataNode;
		head=head.getNextNode();
		counter--;
		return data;
	}
	
	public String SearchForData(String data) {
		NodeClass tempHead = head;
		int count = counter;
		while(tempHead!=null && tempHead.getDataNode().compareTo(data)!=0) {
			count--;
			if(tempHead.getNextNode()!=null)
				tempHead= tempHead.getNextNode();
			else
				return "Data not found";
	}
		return "Data Found at "+count++;
}	
	
	public String SearchForDataAndRemove(String data) {
		NodeClass tempHead = head;
		int count = counter;
		if(tempHead.getDataNode().compareTo(data)==0) {
			removeFromList();count--;
			return "Data found at head and removed.";
			}
		while(tempHead.getNextNode()!=null && tempHead.getNextNode().getDataNode().compareTo(data)!=0) {
			count--;
			if(tempHead.getNextNode()!=null)
				tempHead= tempHead.getNextNode();
			else
				return "Data not found";
	}
		if(tempHead.getNextNode()!=null&&tempHead.getNextNode().getNextNode()!=null)
			tempHead.setNextNode(tempHead.getNextNode().getNextNode());
		else
		{
			if(tempHead.getDataNode().compareTo(data)!=0)
				return "Data Not found";
			tempHead.setNextNode(null);
		}counter--;
		return "Data deleted from "+count--;
	}
	
	public String MoveAndInsertInMid(String before,String data) {
		NodeClass tempHead = head;
		int count = counter;
		while(tempHead!=null && tempHead.getDataNode().compareTo(before)!=0) {
			count--;
			if(tempHead.getNextNode()!=null)
				tempHead= tempHead.getNextNode();
			else
				return before+"Data not found in list";
	}
		System.out.println("Data Found at "+count++);
		NodeClass newNode= new NodeClass(data);
		if(tempHead.getNextNode()!=null)
			newNode.setNextNode(tempHead.getNextNode());
		tempHead.setNextNode(newNode);
		counter++;
		return "Data added at "+count;
	}
	
	@Override
	public String toString() {
		NodeClass tempHead = head;
		String data="";
		while(tempHead!=null) {
			data=data+tempHead.dataNode+"=>";
			tempHead=tempHead.nextNode;
		}
		//data=data+tempHead.dataNode;
		return data;
	}

}
