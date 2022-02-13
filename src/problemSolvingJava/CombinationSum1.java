package problemSolvingJava;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        recurse(ans, candidates, new ArrayList<Integer>(), 0, 0, 0, target);
        return ans;
    }
    
    static void recurse(List<List<Integer>> ans, int[] candidates,
    		List<Integer> temp, int i, int sum, int tempSize, int target) {
    	if(sum==target) {
    		ans.add(new ArrayList<Integer>(temp));
    		return;
    	}
    	if(sum>target || i==candidates.length) {
    		return;
    	}
    	recurse(ans, candidates, temp, i+1, sum, tempSize, target);
    	temp.add(candidates[i]);
    	recurse(ans,candidates,temp,i,sum+candidates[i],tempSize+1,target);
    	temp.remove(tempSize);
    }

}
