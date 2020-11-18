package linkedin;

public class Node {
	private int data;
	private Node next;
	
	public Node(int data) {
		this.data = data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return this.data;
	}
	
	public void setNextNode(Node node) {
		this.next = node;
	}
	
	public Node getNextNode() {
		return this.next;
	}
	
	@Override
	public String toString() {
		return "Data:" + this.data;
	}
}
