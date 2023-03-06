package LinkedList;

public class SearchInSinglyLinkedList {
	
	public static void main(String[] args) {
		SearchInSinglyLinkedList list = new SearchInSinglyLinkedList();
		list.insertAtHead("john");
		list.insertAtHead("jessica");
		list.insertAtHead("rob");
		list.insertAtHead("smith");
		
		boolean result = list.searchNode("rob");
		System.out.println(result);
		
		int listLength = list.length();
		System.out.println("Length of linked list is "+ listLength);
	}

	public class Node {
		public String data;
	    public Node nextNode;
	}

	public Node headNode; //head node of the linked list
	public int size;      //size of the linked list

	public SearchInSinglyLinkedList() {
		headNode = null;
	    size = 0;
	}
	    
	//Insertion at head in Singly Linked List	
	public void insertAtHead(String data) {
		Node newNode = new Node();
	    newNode.data = data;
	    newNode.nextNode = headNode;
	    headNode = newNode;
	    size++;
	}
	    
	//Search in Singly Linked List
	public boolean searchNode(String data) {
		Node currentNode = this.headNode;
		while(currentNode != null) {
			if(currentNode.data.equals(data)) {
				return true;
			}
	        currentNode = currentNode.nextNode;
		}
	    return false; //value not found
	}
	
	//Check if list is empty or not
	public boolean isEmpty() {
		if(this.headNode == null)
			return true;
		else
			return false;	
	}
	
	// Find the length of a Linked List
	public int length() {
		int count = 0;
	    if(isEmpty()) {
	    	return 0;
	    }
	    Node currentNode = this.headNode;
	    while(currentNode != null) {
	    	currentNode = currentNode.nextNode;
	        count++;
	    } 
	    return count;
	}
	
}
