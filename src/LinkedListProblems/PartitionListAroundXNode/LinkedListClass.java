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
		NodeClass head1= head, head2=head;
		StringBuilder st =new StringBuilder();
		while(head2!=null) {
			if(head2.getData()==node) {
				
				while(head2!=null) {
					st.append(head2.getData()+"->");
					head2=head2.getNext();
					}
				System.out.println(st.toString());
				head1.setNext(null);
				break;
				}
			else {
				head1=head1.getNext();
				head2=head2.getNext();
			}
		}
		return toString();
	}

}
