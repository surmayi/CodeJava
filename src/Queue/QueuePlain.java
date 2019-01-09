package Queue;


import java.util.LinkedList;

public class QueuePlain {
	
	String head, tail, headNext;
	LinkedList<String> queue = new LinkedList<String>();
	
	public void pushToQueue(String word) {
		if(queue.isEmpty()) {
			queue.push(word);
			this.head = queue.peek();
			this.tail = queue.peek();
		}
		else {
			queue.push(word);
			this.tail = queue.peek();
		}
	}
	
	public String popFromQueue() {
		if(queue.isEmpty())
			return "NO DATA IN QUEUE";
		else
		{
			String data = queue.removeLast();
			if(queue.isEmpty())
				{this.head=null;
				this.tail =null;}
			else
				this.head=queue.getLast();
			return data;
		}	
	}
	
	public String getHead() {
		return this.head;
	}
	
	public String getTail() {
		return this.tail;
	}
	
	@Override
	public String toString() {
		String data ="";
		LinkedList<String> temqueue = new LinkedList<String>(queue);
		while(!temqueue.isEmpty()) {
			data=data+temqueue.removeLast()+"=>";
			
		}
		if(!data.isEmpty())
		data=data.substring(0,data.length()-2);
		else 
		return "NO DATA IN QUEUE";
		return data;
	}

}
