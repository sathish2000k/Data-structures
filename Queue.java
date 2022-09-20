
public class Queue {
	int size, front, rear;
	int[] array;
	Queue(int size) {
		array = new int[size];
		this.size = size;
		front = -1;
		rear = -1;
	}
	
	public void enqueue(int number) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else {
			if(front == -1) {
				front++;
			}
			array[++rear] = number;
			System.out.println(array[rear]+" inserted");
		}
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			if(front==rear) {
				front = -1;
				rear = -1;
			}
			System.out.println(array[front]+" deleted");
			front++;			
		}
		
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			for(int i=front;i<=rear;i++) {
				System.out.println(array[i]);
			}
		}
	}
	
	public boolean isFull() {
		return front == 0 && rear == size-1;
	}
	
	public boolean isEmpty() {
		return front == -1;
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue(5);
		queue.dequeue();
	    queue.enqueue(1);
	    queue.enqueue(2);
	    queue.enqueue(3);
	    queue.enqueue(4);
	    queue.enqueue(5);
	    queue.display();
	    queue.enqueue(6);
	    queue.display();
	    queue.dequeue();
	    queue.display();
	}
}
