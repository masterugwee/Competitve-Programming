package CircularLinkedList;

public class CircularLinkedList {

	
	public Node insert(Node head,int data)
	{
		Node newNode = new Node(data);
		Node temp = head;
		newNode.next = head;
		if(head != null)
		{
			while(temp.next!=head) {
				
				temp = temp.next;
				}
			temp.next = newNode;
		}
		else
		{
			newNode.next = newNode;
		}
		head = newNode;
		return newNode;
		
	}
	
	public void PrintList(Node node)
	{
		Node temp = node;
		if(node != null)
		{
			do
			{
				System.out.println(" "+temp.data);
				temp = temp.next;
			}while(temp!=node);
		}
	}
	
	public Node deleteElement(Node head,int data)
	{
		if(head == null)
		{
			return null;
		}
		Node present = head;
		Node last = new Node();
		while(present.data != data)
		{
			if(present.next == head)
			{
				System.out.println("No element present\n");
			break;
			}
			last = present;
			present = present.next;
		}
		if(present.next == head)
		{
			head = null;
			return head;
		}
		if(present == head)
		{
			last = head;
			while(last.next!=head)
			{
				last = last.next;
			}
			head = present.next;
			last.next= head;

		}
		else if(present.next == head)
		{
			last.next = head;
		}
		else
		{
			last.next = present.next;
		}
		return head;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularLinkedList cll = new CircularLinkedList();
		Node head = null;
		head = cll.insert(head, 20);
		head = cll.insert(head, 30);
		head = cll.insert(head, 70);
		System.out.println("The present list is \n");
		cll.PrintList(head);
System.out.println("After removing the element, the list is: \n");
		head = cll.deleteElement(head, 30);
		cll.PrintList(head);
		
		
	}

}
