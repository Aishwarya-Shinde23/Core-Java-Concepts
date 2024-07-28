package Collections.Stack;

public class StackUsingLinkedList {

	Node head;
	
	class Node{
		int value;
		Node next;
	}
	
	StackUsingLinkedList(){
		head = null;
	}
	
	//To print all vaues of LinkedList -->
	public static void printList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.value + " ");
			temp=temp.next;
		}
	}
		
	public static void main(String[] args) {
		
		StackUsingLinkedList lls = new StackUsingLinkedList();
				
		lls.push(10);
		lls.push(20);
		lls.push(30);
		lls.push(60);
		lls.push(90);
		
		System.out.println("Element popped from stack : " + lls.pop());

		System.out.println("Element popped from stack : " + lls.pop());

		lls.push(60);
		lls.push(90);
		lls.push(45);
		
		System.out.println("Element popped from stack : " + lls.pop());
		
		System.out.println("All values of LinkedList -->");
		printList(lls.head);
	}
	
	public void push(int value) {
		Node extraHead = head;
		head = new Node();
		head.value = value;
		head.next = extraHead;
		
		System.out.println("Element pushed in stack : " + value);		
	}
	
	public int pop() {
		if(head==null) {
			System.out.println("Stack is empty");
		}
			int value = head.value;
			head = head.next;
			return value;
		}
	}
