package bridgelabz;
public class StackLinkedList {
	class Node {
		int num;
		Node link;
	}
	Node top;
	StackLinkedList() {
		this.top =null;
	}
	public void push(int x) 
    {
        Node value = new Node();
        if (value == null) {
            System.out.print("Heap Overflow");
            return;
        }
        value.num = x;
        value.link = top;
        top = value;
    }
	public boolean isEmpty() {
	    return top == null;
	}
	public int peek() {
	    if (!isEmpty()) {
	        return top.num;
	    }
	    else {
	        System.out.println("Stack is empty");
	        return -1;
	    }
	}
	 public void display()
	    {    
		 if (top == null) {
			 System.out.printf("\nStack Underflow");	        
	     }
	     else {
	    	 Node value = top;
	         while (value != null) {
	                System.out.printf("%d->", value.num);
	                value = value.link;
	            }
	    }
	}
	 public void pop() {
	     if (top == null) {
	    	 System.out.print("\nStack Underflow");
	         return;
	     }
	     top = (top).link;
	 }
	 
	public static void main(String[] args) {
		System.out.println("Welcome to Stack Problems");
		
		StackLinkedList list = new StackLinkedList();
		list.push(70);
		list.push(30);
		list.push(56);
		
		list.display();
		System.out.printf("\nTop element is %d\n", list.peek());
		
		list.pop();
		list.pop();
		list.pop();

		list.display();
		System.out.printf("\nTop element is %d\n", list.peek());
		
	}
}
