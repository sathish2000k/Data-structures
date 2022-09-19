
public class Stack {
	int[] array;
	int size;
	int head;
	Stack(int size){
		array = new int[size];
		head = -1;
		this.size = size;
	}

	public void push(int number) {
		if(isFull()) {
			System.out.println("Stack is full");
		}
		else {
			array[++head]=number;
			System.out.println(array[head]+" inserted");
		}		
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			head--;
		}
	}
	
	public void print() {
		for(int i=size()-1; i>=0; i--) {
			System.out.println(array[i]);
		}
	}
	
	public int size() {
		return head+1;
	}
	
	public boolean isEmpty() {
		return head == -1;
	}
	
	public boolean isFull() {
		return head == size-1;
	}
	
	public static void main(String[] args) {
	    Stack stack = new Stack(5);  
	    stack.push(1);
	    stack.push(2);
	    stack.push(3);
	    stack.push(4);
            System.out.println("Before popping out");
            stack.print();
	    stack.pop();
	    System.out.println("After popping out");
	    stack.print();
		
	}

}
