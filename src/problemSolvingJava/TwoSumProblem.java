package problemSolvingJava;
import java.util.HashMap;
public class TwoSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int[] twoSum(int[] nums, int target) {
    	HashMap<Integer,Integer> cache = new HashMap<Integer,Integer>();
    	int[] ans = new int[2];
    	int required;
    	for(int i=0; i<nums.length; i++) {
    		required = target-nums[i];
    		if (cache.containsKey(required)) {
    			ans[0] = cache.get(required);
    			ans[1] = i;
    			break;
    		}
    		else {
    			cache.put(nums[i], i);
    		}
    	}
    	
    	return ans;
    }

}
