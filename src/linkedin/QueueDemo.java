package linkedin;

public class QueueDemo {
	public static void main(String[] args) {
		Queue queue = new Queue(4);
		
		queue.enqueue(3);
		queue.enqueue(8);
		queue.enqueue(9);
		queue.dequeue();
		queue.enqueue(13);
		queue.enqueue(23);
		queue.dequeue();
		queue.dequeue();
		
		queue.printQueue();
	}
}
