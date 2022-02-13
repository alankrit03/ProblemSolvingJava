package problemSolvingJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        recurse(ans, candidates, new ArrayList<Integer>(), 0, 0, 0, target,false);
        return ans;
    }
    
    static void recurse(List<List<Integer>> ans, int[] candidates,
    		List<Integer> temp, int i, int sum, int tempSize, int target, boolean chosePrev) {
    	if(sum==target) {
    		ans.add(new ArrayList<Integer>(temp));
    		return;
    	}
    	if(sum>target || i==candidates.length)
    		return;
    	
    	recurse(ans, candidates, temp, i+1, sum, tempSize, target, false);
    	
    	if(i>0 && candidates[i]==candidates[i-1] && chosePrev==false)
    		return;
    	
    	temp.add(candidates[i]);
    	recurse(ans, candidates, temp, i+1, sum+candidates[i], tempSize+1, target, true);
    	temp.remove(tempSize);
    }

}
