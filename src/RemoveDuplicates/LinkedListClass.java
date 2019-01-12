package RemoveDuplicates;

import java.util.HashMap;

// TODO Remove dups - with/without temp buffer
public class LinkedListClass {
	
	NodeClass head;
	int counter;
	public void addtoHead(String data) {
		NodeClass node = new NodeClass(data);
		if(head!=null) {
			node.setNextNode(head);
			counter++;
		}
		head = node;
	}
	
	public String removeFromHead() {
		String data="";
		if(head!=null) {
			data = head.getData();
			head=head.getNextNode();
			counter--;
			return data;
		}
		return "List is Empty";
	}
	
	@Override
	public String toString() {
		NodeClass tempHead = head;
		StringBuilder str = new StringBuilder();
		while(tempHead!=null) {
			str.append("=>"+tempHead.getData());
			tempHead = tempHead.getNextNode();
		}
		return str.toString();
	}
	
	public String removeDuplicates() {
		NodeClass tempHead = head, prev=head;
		StringBuilder str = new StringBuilder();
		HashMap<String,String> map = new HashMap<String,String>();
		while(tempHead!=null ) {
			if(map.containsKey(tempHead.getData())){
				str.append("Removed Duplicate Node "+ tempHead.getData() + "\n");
				prev.setNextNode(tempHead.getNextNode());
				tempHead=tempHead.getNextNode();
				
			}
			else {
				map.put(tempHead.getData(), "1");
				prev=tempHead;
				tempHead=tempHead.getNextNode();
				
			}
		}
		return str.toString();
	}

}
