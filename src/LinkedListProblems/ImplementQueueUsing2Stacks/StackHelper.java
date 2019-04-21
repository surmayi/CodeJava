package LinkedListProblems.ImplementQueueUsing2Stacks;

import java.util.Stack;

public class StackHelper {
	
	
	NodeClass rear;
	int size =0;
	public void addToRear(int data) {
		NodeClass node = new NodeClass(data);
		if(rear!=null)
			node.setNext(rear);
		rear =node;
		size++;
	}
	
	public int removeFromFront() {
		if(rear!=null) {
			NodeClass head =rear.getNext(), prev =rear;
			Stack<Integer> temp1 =new Stack<Integer>();
			while(head.getNext()!=null) {
				temp1.push(prev.getData());
				if(head.getNext()!=null)
					prev =head;
				head=head.getNext();
			}
			prev.setNext(null);
			return head.getData();
		}
		else return 0;
	}
	@Override
	public String toString() {
		NodeClass head =rear;
		StringBuilder st = new StringBuilder();
		while(head!=null) {
			st.append("->"+ head.getData());
			head =head.getNext();
		}
		return st.toString();
		
		
	}
}
