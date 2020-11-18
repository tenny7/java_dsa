package linkedin;

public class DoublyLinkedListDemo {
	public static void main(String[] args) {
		DoublyLinkedList dlist = new DoublyLinkedList();
		dlist.insertAtTail(5);
		dlist.insertAtTail(8);
		dlist.insertAtTail(9);
		dlist.insertAtTail(4);
		dlist.insertAtTail(1);
		
		
		System.out.print(dlist);
	}
}
