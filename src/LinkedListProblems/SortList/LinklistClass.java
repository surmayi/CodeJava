package LinkedListProblems.SortList;

import java.util.Stack;

public class LinklistClass {

	Stack<Integer> head ;
	int counter=0;
	
	public void addToList(int data) {
		if(head==null)
			head = new Stack<Integer>();
		head.push(data);
		counter++;
			
	}
	
	public int getLength() {
		return counter;
	}
	
	public int removeFromList() {
		int data = head.pop();
		counter--;
		return data;
	}
	
	public String SortList() {
		Stack<Integer> head1 =head;
		Stack<Integer> temp = new Stack<Integer>();
		temp.push(head1.pop());
		int t =0;
		while(!head1.isEmpty()) {
			t = head1.pop();
			while(!temp.isEmpty() && temp.peek()>t) 
				head1.push(temp.pop());
			temp.push(t);}
		StringBuilder st = new StringBuilder();
		while(!temp.isEmpty()) {
			int n = temp.pop();
			st.append("->" + n);
			addToList(n);}
		return st.toString();
	}
	
	@Override
	public String toString() {
		Stack<Integer> tempHead = new Stack<Integer>();
		tempHead =head;
		String data="";
		while(tempHead!=null) {
			data=data+tempHead.peek()+"=>";
			tempHead.pop();
		}
		//data=data+tempHead.dataNode;
		return data;
	}

}
