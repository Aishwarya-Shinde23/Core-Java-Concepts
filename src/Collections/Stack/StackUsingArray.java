package Collections.Stack;

import java.util.Stack;

public class StackUsingArray {

	int size;
	int arr[];
	int top;
	
	StackUsingArray(int size){
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
	}
	
	public static void main(String[] args) {
		
		StackUsingArray stack = new StackUsingArray(20);
		
		stack.pop();
		
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		
		System.out.println("Peek element of stack is : " + stack.peek());
		
		stack.pop();
		
		System.out.println("Peek element of stack is : " + stack.peek());
		
		stack.pop();
		
		System.out.println("Peek element of stack is : " + stack.peek());
		
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.isFull());
		
	}
	
	//To pop/remove/fetch value from stack -->
		public int pop() {
			if(!isEmpty()) {
				int returnedTop = top;
				top--;
				
				System.out.println("Popped element : " + arr[returnedTop]);
				return arr[returnedTop];
			}
			else
			{
				System.out.println("Stack is empty");
				return -1;
			}
			
		}
			
		//To add value in stack -->
		public void push(int element) {
			if(!isFull()) {
				top++;
				arr[top]=element;
				System.out.println("Pushed element : " + element);
			}
			else {
				System.out.println("Stack is full");
			}
			
		}
		
		//peek() --> To obtain the topmost value present in stack
		public int peek() {
			if(!this.isEmpty()) {
				return arr[top];
			}
			else
			{
				System.out.println("Stack is empty");
				return -1;
			}
		}
			
		//isFull() --> To check is Stack is full/ not
		public boolean isFull(){
			return(size-1==top);				
		}
		
		//isEmpty()--> To check is Stack is empty/ not
		public boolean isEmpty() {
			return(top==-1);
		}
}
