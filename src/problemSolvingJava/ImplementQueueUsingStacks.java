package problemSolvingJava;

import java.util.Stack;

public class ImplementQueueUsingStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

//class Node{
//	int val;
//	Node next;
//	Node(int val){
//		this.val = val;
//	}
//}
//
//class MyStack {
//	int size;
//	Node root;
//	MyStack(){
//		size=0;
//	}
//	
//	void push(int x) {
//		size++;
//		if(root==null) {
//			root = new Node(x);
//		}
//		else {
//			Node temp = new Node(x);
//			temp.next = root;
//			root = temp;
//		}
//	}
//	
//	int pop() {
//		int temp = root.val;
//		root = root.next;
//		size--;
//		return temp;
//	}
//	
//	boolean hasNext() {
//		return size>0;
//	}
//	
//	int top() {
//		return root.val;
//	}
//}


class MyQueue {
	Stack<Integer> stack1;
	Stack<Integer> stack2;
	int size;

    public MyQueue() {
    	size = 0;
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        for(int i=0;i<size;i++)
        	stack2.push(stack1.pop());
        
        stack1.push(x);
        for(int i=0;i<size;i++)
        	stack1.push(stack2.pop());
        
        size++;
    }
    
    public int pop() {
        return stack1.pop();
    }
    
    public int peek() {
        return stack1.lastElement();
    }
    
    public boolean empty() {
        return size==0;
    }
}