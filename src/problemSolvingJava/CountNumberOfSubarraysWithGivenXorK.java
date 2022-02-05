package problemSolvingJava;
import java.util.HashMap;
import java.util.ArrayList;

public class CountNumberOfSubarraysWithGivenXorK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int solve(ArrayList<Integer> A, int B) {
    	HashMap<Integer,Integer> cache = new HashMap<Integer,Integer>();
    	int ans = 0;
    	int xorSum = 0;
    	for(int item:A) {
    		xorSum ^= item;
    		if(xorSum==B)
    			ans++;
    		ans += cache.getOrDefault(xorSum^B, 0);
    		cache.put(xorSum, cache.getOrDefault(xorSum, 0)+1);
    	}
    	return ans;
    }
}