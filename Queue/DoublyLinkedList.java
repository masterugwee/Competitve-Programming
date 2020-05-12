package DoublyLinkedList;

public class DoublyLinkedList {
	 Node head;
	 public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}
	Node tail;
	
	public void insert(int data)
	{
		Node newNode = new Node(data);
		newNode.nextElement = head;
		newNode.prevElement = null;
		if(head!=null)
		{
			head.prevElement = newNode;
		}
		head = newNode;
		
	}
	
	public void insertAfter(Node lastnode,int data)
	{
		if(lastnode == null)
		{
			System.out.println("There is no previous node \n");
			return;
		}
		
		Node newNode = new Node(data);
		newNode.nextElement = lastnode.nextElement;
		lastnode.nextElement = newNode;
		newNode.prevElement = lastnode;
		if(newNode.nextElement!=null)
		{
			newNode.nextElement.prevElement = newNode;
		}
	}
	
	void appendNode(int data)
	{
		Node newNode = new Node(data);
		Node last = head;
		newNode.nextElement = null;
		if(head == null)
		{
			newNode.prevElement = null;
			head = newNode;
			return;
		}
		while(last.nextElement!=null)
		{
			last = last.nextElement;
		}
		last.nextElement = newNode;
		newNode.prevElement = last;
	}

	
	public void printlist(Node node)
	{
		System.out.println("Please find the linked list\n");
		Node lastnode = null;
		System.out.println("Traversing through the list\n");
		while(node!=null)
		{
			//System.out.println("Traversing through the list\n");
			while(node!=null)
			{
				System.out.println(" "+node.data);
				lastnode = node;
				node = node.nextElement;
			
			}
			
		}
	}
	
	public void deleteNode(Node referenceNode,Node nodetobedeleted)
	{
		if(head == null || nodetobedeleted == null)
		{
			return;
		}
		if(head == nodetobedeleted)
		{
			head = nodetobedeleted.nextElement;
		}
		if(nodetobedeleted.nextElement != null)
		{
			nodetobedeleted.nextElement.prevElement = nodetobedeleted.prevElement;
		}
		if(nodetobedeleted.prevElement != null)
		{
			nodetobedeleted.prevElement.nextElement = nodetobedeleted.nextElement;
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.appendNode(10);
		dll.appendNode(20);
		dll.appendNode(30);
		dll.appendNode(50);
		dll.insert(70);
		dll.insertAfter(dll.head, 12);
		dll.printlist(dll.head);
		dll.deleteNode(dll.head,dll.head.nextElement);
		System.out.println("\n After deleting the next node");
		dll.printlist(dll.head);
		

	}

	

}
