package problemSolvingJava;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutationsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        boolean[] cache = new boolean[nums.length];
        recurse(nums,ans, new ArrayList<Integer>(), cache, 0);
        return ans;
    }
    
    static void recurse(int[] nums, List<List<Integer>> ans, List<Integer> temp, boolean[] cache, int tempSize) {
    	if(nums.length==tempSize) {
    		ans.add(new ArrayList<>(temp));
    		return;
    	}
    	
    	for(int i=0; i<nums.length; i++) {
    		if(cache[i]==false) {
    			cache[i] = true;
    			temp.add(nums[i]);
    			recurse(nums,ans,temp,cache,tempSize+1);
    			temp.remove(tempSize);
    			cache[i] = false;
    		}
    	}
    }

}
