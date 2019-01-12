package LinkedListProblems.PartitionListAroundXNode;


public class LinkedListClass {
	
	NodeClass head;
	int counter;
	
	public void addtoHead(int data) {
		NodeClass node = new NodeClass(data);
		if(head!=null) {
			node.setNext(head);
			counter++;
		}
		head = node;
	}
	
	public int removeFromHead() {
		int data;
		if(head!=null) {
			data = head.getData();
			head=head.getNext();
			counter--;
			return data;
		}
		return -1;
	}
	
	@Override
	public String toString() {
		NodeClass tempHead = head;
		StringBuilder str = new StringBuilder();
		while(tempHead!=null) {
			str.append("=>"+tempHead.getData());
			tempHead = tempHead.getNext();
		}
		return str.toString();
	}

	public String PartitionAroundXElement(int node) {
		NodeClass prev=head,current=head, tempHead=head;
		while(tempHead.getData()!=node) {
			tempHead=tempHead.getNext();
		}
		while(current!=null && current!=tempHead) {
			if(tempHead.getData()>current.getData()) {
				current=current.getNext();
				prev=current;
			}
			else if(tempHead==current){
				current=current.getNext();
				prev=current;
			}
			else{
				prev=prev.getNext();
				current.setNext(tempHead.getNext());
				tempHead.setNext(current);
				current=prev;
				head=prev;
			}
			System.out.println(toString());
		}
		prev=tempHead; current=current.getNext();
		while(current!=null) {	
			if(tempHead.getData()>current.getData()) {
				prev.setNext(current.getNext());;
				current.setNext(head);
				head=current;
				current=prev.getNext()
						;
			}
			else{
				prev=prev.getNext();
				current=current.getNext();
			}
			System.out.println(toString());
			
		}
		return toString();
	}

}
