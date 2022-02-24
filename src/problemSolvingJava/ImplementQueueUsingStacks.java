package problemSolvingJava;

public class ImplementQueueUsingStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class Node{
	int val;
	Node next;
	Node(int val){
		this.val = val;
	}
}

class MyStack {
	int size;
	Node root;
	MyStack(){
		size=0;
	}
	
	void push(int x) {
		size++;
		if(root==null) {
			root = new Node(x);
		}
		else {
			Node temp = new Node(x);
			temp.next = root;
			root = temp;
		}
	}
	
	int pop() {
		int temp = root.val;
		root = root.next;
		size--;
		return temp;
	}
	
	boolean hasNext() {
		return size>0;
	}
	
	int top() {
		return root.val;
	}
}


class MyQueue {
	MyStack stack1;
	MyStack stack2;

    public MyQueue() {
        stack1 = new MyStack();
        stack2 = new MyStack();
    }
    
    public void push(int x) {
        while(stack1.hasNext())
        	stack2.push(stack1.pop());
        
        stack1.push(x);
        while(stack2.hasNext())
        	stack1.push(stack2.pop());
    }
    
    public int pop() {
        return stack1.pop();
    }
    
    public int peek() {
        return stack1.top();
    }
    
    public boolean empty() {
        return stack1.size==0;
    }
}