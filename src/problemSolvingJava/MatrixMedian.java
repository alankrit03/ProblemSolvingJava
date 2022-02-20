package problemSolvingJava;

import java.util.ArrayList;

public class MatrixMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
    	int row = A.size();
    	int col = A.get(0).size();
    	int lo = getMin(A,row,col);
    	int hi = getMax(A,row,col)+1;
    	int mid,count;
    	int n = row*col;
    	while(hi-lo>1) {
    		mid = (hi+lo)/2;
    		count = countGreaterEqual(A,row,col,mid);
    		if(count>n/2)
    			lo=mid;
    		else
    			hi=mid;
    		
    	}
    	return lo;
    }
    public static int getMin(ArrayList<ArrayList<Integer>> A, int row, int col) {
    	int ans = A.get(0).get(0);
    	for(int i=1;i<row;i++) {
    		ans = Math.min(ans, A.get(i).get(0));
    	}
    	return ans;
    }
    
    public static int getMax(ArrayList<ArrayList<Integer>> A, int row, int col) {
    	int ans = A.get(0).get(col-1);
    	for(int i=1;i<row;i++) {
    		ans = Math.max(ans, A.get(i).get(col-1));
    	}
    	return ans;
    }
    
    public static int countGreaterEqual(ArrayList<ArrayList<Integer>> A, int row, int col, int target) {
    	int count=0;
    	int lo,hi,mid;
    	for(int i=0;i<row;i++) {
    		lo = -1;
    		hi = col;
    		while(hi-lo>1) {
    			mid = (hi+lo)/2;
    			if(A.get(i).get(mid)>=target)
    				hi=mid;
    			else
    				lo=mid;
    		}
    		count += (col-hi);
    	}
    	return count;
    }

}
