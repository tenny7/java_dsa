package linkedin;

public class StackDemo {
	public static void main(String[] args) throws Exception {
		Stack stack = new Stack(3);
		
		stack.push(3);
		stack.push(4);
		stack.push(9);
		
		System.out.println(stack.peek());
		
	}
}
