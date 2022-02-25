package problemSolvingJava;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	HashMap<Integer,Integer> cache = new HashMap<Integer,Integer>();
    	Stack<Integer> stack = new Stack<Integer>();
    	
    	for(int i=0;i<nums2.length;i++) {
    		
    		while(stack.empty()==false && stack.peek()<nums2[i]) {
    			cache.put(stack.pop(), nums2[i]);
    		}
    		stack.push(nums2[i]);
    	}
    	while(stack.empty()==false) {
    		cache.put(stack.pop(), -1);
    	}
        
    	int ans[] = new int[nums1.length];
    	for(int i=0;i<nums1.length;i++) {
    		ans[i] = cache.get(nums1[i]);
    	}
    	return ans;
    }

}
