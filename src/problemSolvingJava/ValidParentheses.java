package problemSolvingJava;

import java.util.HashMap;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public boolean isValid(String s) {
        HashMap<Character,Character> cache = new HashMap<Character,Character>();
        cache.put('(', ')');
        cache.put('{', '}');
        cache.put('[', ']');
        MyStack stack = new MyStack();
        for(int i=0;i<s.length();i++) {
        	if(cache.containsKey(s.charAt(i))) {
        		stack.push(s.charAt(i));
        	}
        	else {
        		if(stack.hasNext() && s.charAt(i) == cache.get(stack.top())){
        			stack.pop();
        		}
        		else
        			return false;
        	}
        }
        if(stack.size >0)
        	return false;
        return true;
        
    }

}

class Node{
	char val;
	Node next;
	Node(char x){
		val = x;
	}
}

class MyStack {
	int size;
	private Node root;
	MyStack(){
		size=0;
	}
	
	void push(char x) {
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
	
	char pop() {
		int temp = root.val;
		root = root.next;
		size--;
		return temp;
	}
	
	boolean hasNext() {
		return size>0;
	}
	
	char top() {
		return root.val;
	}
}