package ReverseLinkedList;

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
		NodeClass head1 = head, head2 =head;
		while(head2.getNexNode()!=null) {
			head1=head1.getNexNode();
			head2=head2.getNexNode().getNexNode();
		}
		return head1.data;
	}
	
	public void ReverseList() {
		NodeClass prev =null, next = head.getNexNode(),curr= head;
		while(curr!=null)
		{
			curr.setNexNode(prev);
			prev=curr;
			curr=next;
			if(next!=null)
				next=next.getNexNode();
		}
		head = prev;
	}

}
