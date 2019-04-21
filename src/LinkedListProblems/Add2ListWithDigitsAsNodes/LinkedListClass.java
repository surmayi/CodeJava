package LinkedListProblems.Add2ListWithDigitsAsNodes;

public class LinkedListClass {

	NodeClass head;
	public NodeClass getHead() {
		return head;
	}

	public void setHead(NodeClass head) {
		this.head = head;
	}

	int counter;
	
	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public void AddtoHead(int data) {
		NodeClass node = new NodeClass(data);
		if(head!=null) {
			node.setNext(head);
		}
		head = node;
		counter++;
	}
	
	public int RemoveFromHead() {
		if(head!=null) {
			counter--;
			int data = head.getData();
			head = head.getNext();
			return data;
		}
		System.out.println("List is Empty");
		return 0;
	}
	
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		NodeClass tempHead = head;
		while(tempHead!=null) {
			str.append("=>"+tempHead.getData());
			tempHead = tempHead.getNext();
		}
		return str.toString();
	}
	//2-1-6 = 216
	public int ConvertListToNumber(LinkedListClass list) {
		int num =0 ;
		while(list.getHead()!=null) {
			num=num*10+list.getHead().getData();
			list.setHead(list.getHead().getNext());
		}
		return num;
	}
}
