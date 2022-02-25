package problemSolvingJava;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public boolean isValid(String s) {
        HashMap<Character,Character> cache = new HashMap<Character,Character>();
        cache.put('(', ')');
        cache.put('{', '}');
        cache.put('[', ']');
        Stack<Character> stack = new Stack<Character>();
        int size = 0;
        for(int i=0;i<s.length();i++) {
        	if(cache.containsKey(s.charAt(i))) {
        		stack.push(s.charAt(i));
        		size++;
        	}
        	else {
        		if(size>0 && s.charAt(i) == cache.get(stack.lastElement())){
        			stack.pop();
        			size--;
        		}
        		else
        			return false;
        	}
        }
        if(size >0)
        	return false;
        return true;
        
    }

}

