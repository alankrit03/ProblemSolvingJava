package problemSolvingJava;

import java.util.Stack;

public class PreviousSmallerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] prevSmaller(int[] A) {
		Stack<Integer> stack = new Stack<Integer>();
		int[] ans = new int[A.length];
		for(int i=A.length-1;i>=0;i--) {
			while(stack.empty()==false && A[stack.peek()]>A[i]) {
				ans[stack.pop()] = A[i];
			}
			stack.push(i);
		}
		while(stack.empty()==false) {
			ans[stack.pop()] = -1;
		}
		return ans;
	}

}
