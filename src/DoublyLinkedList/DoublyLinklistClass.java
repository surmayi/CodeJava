package DoublyLinkedList;

public class DoublyLinklistClass {
	
	NodeClass head;
	NodeClass tail;
	int counter=0;
	
	public void addToListFromHead(String data) {
		NodeClass node = new NodeClass(data);
		if(head!=null) {
			node.setNext(head);
			head.setPrev(node);
			head=node;
		}
		else
		{
			head = tail = node;	
		}
		counter++;
	}
	
	public void addToTail(String data) {
		NodeClass node = new NodeClass(data);
		if(tail!=null) {
			node.setPrev(tail);
			tail.setNext(node);
			tail = node;
		}
		else {
			head = tail=node;}
		counter++;
	}
	
	public int getLength() {
		return counter;
	}
	
	public String removeFromHead() {
		if(head!=null) {
		String data = head.data;
		head= head.getNext();
		head.setPrev(null); 
		counter--;
		return data;}
		else
			return "NO DATA IN LIST FROM HEAD";
	}
	
	public String removeFromTail() {
		if(tail!=null) {
			String data = tail.data;
			tail=tail.getPrev();
			if(tail!=null)
			tail.setNext(null); counter--;
			return data;
		}
		else return "NO DATA IN LIST FROM TAIL";
	}
	
	public String SearchForDataFromHead(String data) {
		NodeClass tempHead = head; int count=counter;
		if(tempHead.getData().compareTo(data)==0)
			return "Data Found at Head";
		while(tempHead.getNext()!=null && tempHead.getNext().getData().compareTo(data)!=0) {
			tempHead= tempHead.getNext();
			count--;
		}
		if(tempHead.getNext()!=null) {
		tempHead= tempHead.getNext();
		if(tempHead.getData().equals(data))
			return "Data Found at "+--count;
		else
			return "Data Not Found";}
		else
			return  "Data Not Found";
	}
	
	public String searchForDataFromHead(String data) {
		NodeClass tempHead = head; int count=counter;
		while(tempHead!=null && tempHead.getData().compareTo(data)!=0) {
			tempHead= tempHead.getNext();
			count--;
		}
		if(tempHead!=null)
		
			return "Data Found at "+count;
		else
			return  "Data Not Found";
	}
	
	public String searchForDataFromTail(String data) {
		NodeClass tempTail = tail; int count=counter;
		while(tempTail!=null && tempTail.getData().compareTo(data)!=0) {
			tempTail= tempTail.getPrev();
			count--;
		}
		if(tempTail!=null)
		
			return "Data Found at "+count;
		else
			return  "Data Not Found";
	}
	
	public String LocateAndRemoveFromHead(String data) {
		NodeClass tempHead = head;int count = counter;
		if(tempHead.getData().compareTo(data)==0) {
			removeFromHead();
			return "Data Found at Head";
		}
		while(tempHead.getNext()!=null && tempHead.getNext().getData().compareTo(data)!=0) {
			if(tempHead.getNext()!=null)
				tempHead= tempHead.getNext();
			count--;
		}
		if(tempHead.getNext()!=null && tempHead.getNext().getData().compareTo(data)==0) {
			if(tempHead.getNext().getNext()!=null) {
			tempHead.getNext().getNext().setPrev(tempHead);
			tempHead.setNext(tempHead.getNext().getNext());
			}
			else
				tempHead.setNext(null);
			counter--;
			return "Data Found at "+ count;
		}
		return "Data not found";
	}
	
	public String LocateAndRemoveFromTail(String data) {
		NodeClass tempTail = tail;int count = counter;
		if(tempTail.getData().compareTo(data)==0) {
			removeFromTail();
			return "Data Found at Head";
		}
		while(tempTail.getPrev()!=null && tempTail.getPrev().getData().compareTo(data)!=0) {
			if(tempTail.getPrev()!=null)
				tempTail= tempTail.getPrev();
			count--;
		}
		if(tempTail.getPrev()!=null && tempTail.getPrev().getData().compareTo(data)==0) {
			if(tempTail.getPrev().getPrev()!=null) {
				tempTail.getPrev().getPrev().setNext(tempTail);
			tempTail.setPrev(tempTail.getPrev().getPrev());
			}
			else
				tempTail.setPrev(null);
			counter--;
			return "Data Found at "+ count;
		}
		return "Data not found";
	}
	
	public String LocateAndInsertFromHead(String before, String data) {
		NodeClass tempHead = head;
		int count= counter;
		if(tempHead.getData().compareTo(before)==0) {
			NodeClass newNode = new NodeClass(data);
			newNode.setNext(tempHead.getNext());
			newNode.setPrev(tempHead);
			tempHead.getNext().setPrev(newNode);
			tempHead.setNext(newNode);
			counter++;
			return "Data added after head";
		}
		while(tempHead.getNext()!=null && tempHead.getNext().getData().compareTo(before)!=0) {
			tempHead=tempHead.getNext();
			count--;
		}
		if(tempHead.getNext()!=null && tempHead.getNext().getData().compareTo(before)==0) {
			
				tempHead=tempHead.getNext();
				NodeClass newNode = new NodeClass(data);
				newNode.setNext(tempHead.getNext());
				newNode.setPrev(tempHead);
				if(tempHead.getNext()!=null) 
					tempHead.getNext().setPrev(newNode);
				else
					tail = newNode;	
				tempHead.setNext(newNode);
				counter++;
				return "Data added at "+--count;	
			
		}
		
		return "Data not found";
	}
	
	public String LocateAndInsertFromTail(String before, String data) {
		NodeClass tempTail = tail;
		int count= counter;
		if(tempTail.getData().compareTo(before)==0) {
			NodeClass newNode = new NodeClass(data);
			newNode.setPrev(tempTail.getPrev());
			newNode.setNext(tempTail);
			tempTail.getPrev().setNext(newNode);
			tempTail.setPrev(newNode);
			counter++;
			return "Data added after head";
		}
		while(tempTail.getPrev()!=null && tempTail.getPrev().getData().compareTo(before)!=0) {
			tempTail=tempTail.getPrev();
			count--;
		}
		if(tempTail.getPrev()!=null && tempTail.getPrev().getData().compareTo(before)==0) {
			
				tempTail=tempTail.getPrev();
				NodeClass newNode = new NodeClass(data);
				newNode.setPrev(tempTail.getPrev());
				newNode.setNext(tempTail);
				if(tempTail.getPrev()!=null) 
					tempTail.getPrev().setNext(newNode);
				else
					head = newNode;	
				tempTail.setPrev(newNode);
				counter++;
				return "Data added at "+--count;	
			
		}
		
		return "Data not found";
	}
	
	@Override
	public String toString() {
		String data="";
		NodeClass tmpHead = head;
		while(tmpHead!=null) {
			data=data+tmpHead.data+"=>";
			tmpHead=tmpHead.next;
		}
		return data;
	}
}
