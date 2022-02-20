package problemSolvingJava;

import java.util.ArrayList;

public class AllocateMinimumNumberOfPages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int books(ArrayList<Integer> A, int B) {
    	int lo=0,hi=0,mid;
    	int n = A.size();
    	if(B>n){
            return -1;
        }
    	for(int i=0;i<n;i++) {
    		lo = Math.max(lo, A.get(i));
    		hi += A.get(i);
    	}
//    	lo points to number which cannot be the answer
    	lo -= 1;
    	while(hi-lo>1) {
    		mid = (hi+lo)/2;
    		if(isConfigPossible(A,n,B,mid))
    			hi=mid;
    		else
    			lo=mid;
    	}
    	return hi;
    }
    
    public static boolean isConfigPossible(ArrayList<Integer> A, int n, int B, int target) {
    	int currPage=0;
    	B--;
    	for(int i=0;i<n;i++) {
    		if(B==(n-i)) {
    			currPage=0;
    			B--;
    		}
    		currPage+=A.get(i);
    		if(currPage>target) {
    			if(B==0)
    				return false;
    			currPage = A.get(i);
    			B--;
    		}
    	}
    	return true;
    }
}
