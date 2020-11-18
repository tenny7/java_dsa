package linkedin;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.inserAtHead(5);
		list.inserAtHead(3);
		list.inserAtHead(6);
		list.inserAtHead(9);
		list.inserAtHead(2);
		list.deleteAtHead();
		
		System.out.print(list);
	}
}
