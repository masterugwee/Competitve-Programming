package DoublyLinkedList;

public class Node {
	int data;
	Node nextElement;
	public Node getNextElement() {
		return nextElement;
	}
	public void setNextElement(Node nextElement) {
		this.nextElement = nextElement;
	}
	public Node getPrevElement() {
		return prevElement;
	}
	public void setPrevElement(Node prevElement) {
		this.prevElement = prevElement;
	}
	Node prevElement;
	public Node(int data) {
		super();
		this.data = data;
		nextElement = null;
		prevElement = null;
	}
}
