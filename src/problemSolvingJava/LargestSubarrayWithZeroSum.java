package problemSolvingJava;
import java.util.HashMap;

public class LargestSubarrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int maxLen(int arr[], int n){
    	HashMap<Integer,Integer> cache = new HashMap<Integer,Integer>();
    	cache.put(0, -1);
    	int ans=0,currSum=0;
    	for(int i=0; i<n; i++) {
    		currSum+=arr[i];
    		if(cache.containsKey(currSum)) {
    			ans = Math.max(ans, i-cache.get(currSum));
    		}
    		else
    			cache.put(currSum, i);
    	}
    	return ans;
    }
}
