package linkedin;

import java.util.EmptyStackException;

public class Stack {
	private int[] stackArray;
	private int top;
	
	public Stack(int capacity) {
		stackArray = new int[capacity];
	}
	
	public void push(int data) throws Exception {
		if(this.top == stackArray.length) {
			int[] newArray = new int[2 * stackArray.length];
			System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
			stackArray = newArray;
		}
		
		stackArray[top++] = data;
	}
	
	public boolean isEmpty() {
		return this.top == 0;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int data = stackArray[--top];
		stackArray[top] = 0;
		return data;
		
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stackArray[top - 1];
	}
		
	public int size() {
		return top;
	}
	
	public void printStack() {
		for(int i = top-1; i >=0; i--) {
			System.out.println(stackArray[i]);
		}
	}
	
	
}
