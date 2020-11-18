package linkedin;

public class LinkedList {
	private Node head;
	
	public void inserAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;	
	}
	
	@Override
	public String toString() {
		String result = "";
		Node current = this.head;
		while (current != null) {
			result += current.getData() + "->";
			current = current.getNextNode();
		}
		result += null + "";
		return result;
	}
	public void deleteAtHead() {
		this.head = this.head.getNextNode();
	}
	
}
