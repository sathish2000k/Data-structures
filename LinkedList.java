
public class LinkedList {
	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public Node insertAtBeginning(int data, Node head) {
		Node node = new Node(data);
		if(head==null) {
			head = node;
		}
		else {
			node.next = head;
			head = node;
		}
		return head;
	}
	
	public void insertAtEnd(int data, Node head) {
		Node node = new Node(data);
		Node tmp = head;
		while(tmp.next!=null) {
			tmp = tmp.next;
		}
		tmp.next = node;
	}
	
	public void insertAt(int data, int pos, Node head) {
		Node node = new Node(data);
		Node tmp = head;
		for(int i=1;i<pos-1 && tmp!=null;i++) {
			tmp=tmp.next;
		}
		node.next = tmp.next;
		tmp.next = node;
						
	}
	
	public void length(Node head) {
		Node node = head;
		int i=0;
		while(node!=null) {
			i++;
			node = node.next;
		}
		System.out.println("length:"+i);
	}
	
	public void display(Node head) {
		Node node = head;
		System.out.println("LinkedList:");
		while(node!=null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	public Node delete(int pos,Node head) {
		Node node = head;
		if(pos==1) {
			head = node.next;
		}
		else {
			for(int i=1;i<pos-1;i++) {
				node = node.next;
			}
			Node node1 = node.next;
			node.next = node1.next;
		}
		return head;
	}
	
	public Node reverse(Node head) {
		Node previous=null,current=head,next=null;
		while(current!=null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.head = null;
		linkedList.head = linkedList.insertAtBeginning(1,linkedList.head);
		linkedList.head = linkedList.insertAtBeginning(2,linkedList.head);
		linkedList.display(linkedList.head);
		linkedList.head = linkedList.insertAtBeginning(3,linkedList.head);
		linkedList.head = linkedList.insertAtBeginning(4,linkedList.head);
		linkedList.insertAtEnd(5,linkedList.head);
		linkedList.display(linkedList.head);
		linkedList.insertAt(0, 2, linkedList.head);
		linkedList.display(linkedList.head);
		linkedList.length(linkedList.head);
		linkedList.head = linkedList.delete(3, linkedList.head);
		linkedList.display(linkedList.head);
		linkedList.head=linkedList.reverse(linkedList.head);
		linkedList.display(linkedList.head);
	}
}
