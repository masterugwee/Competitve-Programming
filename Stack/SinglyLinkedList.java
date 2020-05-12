package LinkedList;

import java.util.LinkedList;

public class SinglyLinkedList {
	
	public Node head;
	
	public SinglyLinkedList insert(SinglyLinkedList newlist,int data)
	{
		Node newNode = new Node(data);
		newNode.nextElement = null;
		if(newlist.head == null)
		{
			newlist.head =newNode;
		}
		else
		{
			Node last = newlist.head;
			while(last.nextElement!= null)
			{
				last = last.nextElement;
			}
		last.nextElement = newNode;
		}
		return newlist;
		
	}

	public static void PrintList(SinglyLinkedList newlist)
	{
		Node current = newlist.head;
		System.out.println("The list is as follows:- \n");
		while(current.nextElement!=null)
		{
			System.out.println(" "+current.data);
			current = current.nextElement;
		}
		System.out.println(" "+current.data);
		System.out.println("\n End of the list");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node newnode;
		SinglyLinkedList newlist = new SinglyLinkedList();
		newlist.insert(newlist, 1);
		newlist.insert(newlist, 2);
		newlist.insert(newlist, 3);
		newlist.insert(newlist, 4);
		newlist.insert(newlist, 5);
		newlist.insert(newlist, 6);
		PrintList(newlist);
		newlist.DeletfromtheLast(newlist.head);
		PrintList(newlist);
		newnode = newlist.DeletefromtheFront(newlist.head);
		newlist.head=newnode;
		PrintList(newlist);
		newnode = newlist.insertatthefront(newlist.head,10);
		newlist.head = newnode;
		PrintList(newlist);

	}

	public Node insertatthefront(Node head2, int newdata) {
		Node newnode = new Node(newdata);
		newnode.nextElement = head2;
		return newnode;
		
		// TODO Auto-generated method stub
		
	}

	public Node DeletefromtheFront(Node head2) {
		// TODO Auto-generated method stub
		if(head2 == null)
			return null;
		System.out.println("Removing element from the front.\n");
		 Node temp = head2;
		 temp = head2.nextElement;
		 System.out.println(temp.data);
		 return temp;
	}

	public  Node DeletfromtheLast(Node head2) {
		// TODO Auto-generated method stub
		System.out.println("Removing the last element.\n");
		if(head2 == null)
		{
			return null;
		}
		if(head2.nextElement == null)
		{
			return null;
		}
		
		Node last = head2;
		while(last.nextElement.nextElement != null)
		{
			last = last.nextElement;
		}
		last.nextElement = null;
		return head;
		
	}

}
