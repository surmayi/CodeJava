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
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		NodeClass head1 = head.getNextNode(), prev=head;
		if(head!=null)
		map.put(head.getData(), 1);
		while(head1!=null ) {
			if(map.containsKey(head1.getData())) 
				prev.setNextNode(head1.getNextNode());		
			else {
				map.put(head1.getData(),1);
				prev= head1;}
			head1=head1.getNextNode();
				
			}
		return toString();
	}

}
