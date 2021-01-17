package khan.com.stack;

public class Stack {
	
	
	private int capacity=100;
	
	private int top;
	
	private int[] array;
	
	public Stack(int capacity) {
		this.top= -1;
		this.capacity = capacity;
		array = new int[this.capacity];
	}
	
	public Stack() {
		this.top= -1;
		array = new int[this.capacity];
	}
	
	public boolean isEmpty() {
		return this.top <0;
	}
	
	public boolean isFull() {
		return this.top == this.capacity-1;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack overflow !!");
			return;
		}
		this.array[++this.top] = data;
	}
	
	public int pop() {
		if(this.isEmpty()) {
			System.out.println("Stack underflow !!");
			return 0;
		}
		return this.array[this.top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack underflow !!");
			return 0;
		}
		return this.array[this.top];
	}
	
	public void printStack() {
		int topTemp = this.top;
		while(topTemp>-1) {
			System.out.println(this.array[topTemp--]);
			
		}
	}

}
