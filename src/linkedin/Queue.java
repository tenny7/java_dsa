package linkedin;

public class Queue {
	private int[] queueArray;
	private int front;
	private int back;
	
	public Queue(int capacity) {
		queueArray = new int[capacity];
	}
	
	public boolean isFull() {
		return back == queueArray.length;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			int[] newArray = new int[2 * queueArray.length];
			System.arraycopy(queueArray, 0, newArray, 0, queueArray.length);
			queueArray = newArray;
		}
		
		queueArray[back++] = data;
	}
	
	public boolean isEmpty() {
		return back == 0;
	}
	
	public void dequeue() {
		int temp = queueArray[front];
		queueArray[front] = 0;
		front++;
		if(isEmpty()) {
			front = 0;
			back =0;
		}
	}
	
	
	
	public void printQueue() {
		for(int i = front; i<=back-1; i++) {
			System.out.print(queueArray[i] + "->");
		}
		System.out.print("null");
	}
}
