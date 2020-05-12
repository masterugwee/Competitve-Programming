package Queue;

import DoublyLinkedList.DoublyLinkedList;

public class Queue extends DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DoublyLinkedList dll = new DoublyLinkedList();
		Queue newQueue = new Queue();
		newQueue.push(dll,10);
		newQueue.push(dll,20);
		newQueue.push(dll,30);
		newQueue.push(dll,40);
		newQueue.pop(dll);
		newQueue.pop(dll);
		dll.printlist(dll.getHead());
	}

	public void push(DoublyLinkedList dll, int i) {
		// TODO Auto-generated method stub
		dll.insert(i);
		
	}
	public void pop(DoublyLinkedList dll) {
		// TODO Auto-generated method stub
		dll.deleteNode(dll.getHead(), dll.getHead());
		
	}
}
