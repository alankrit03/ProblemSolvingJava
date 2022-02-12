package problemSolvingJava;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
    	Collections.sort(arr);
    	ArrayList<Integer> ans = new ArrayList<Integer>();
    	recurse(arr,ans,0,0,N);
    	return ans;
    }
    
    static void recurse(ArrayList<Integer> arr, ArrayList<Integer> ans, int i,int sum, int N) {
    	if(i==N) {
    		ans.add(sum);
    		return;
    	}
    	recurse(arr,ans,i+1,sum,N);
    	recurse(arr,ans,i+1,sum+arr.get(i),N);
    }

}
