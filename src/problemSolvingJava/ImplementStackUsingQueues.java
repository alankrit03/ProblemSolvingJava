package problemSolvingJava;

import java.util.LinkedList;
import java.util.List;


class MyQueue{
	private List<Integer> queue;
	private int size;
	MyQueue(){
		size = 0;
		queue = new LinkedList<Integer>();
	}
	
	void push(int x) {
		size++;
		queue.add(x);
	}
	
	int top() {
		return queue.get(0);
	}
	
	int pop() {
		size--;
		return queue.remove(0);
	}
	
	boolean hasNext() {
		if (size>0)
			return true;
		return false;
	}
}


class MyStack {
	MyQueue queue1;
	MyQueue queue2;
	
    public MyStack() {
        queue1 = new MyQueue();
        queue2 = new MyQueue();
    }
    
    public void push(int x) {
        queue2.push(x);
        while(queue1.hasNext()) {
        	queue2.push(queue1.pop());
        }
        
        while(queue2.hasNext()) {
        	queue1.push(queue2.pop());
        }
    }
    
    public int pop() {
        return queue1.pop();
    }
    
    public int top() {
        return queue1.top();
    }
    
    public boolean empty() {
        if(queue1.hasNext())
        	return false;
        return true;
    }
}

public class ImplementStackUsingQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

