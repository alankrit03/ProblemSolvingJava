package problemSolvingJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
    	List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        List<Integer> temp = new ArrayList<Integer>();
        recurse(ans,nums,0,temp,0,false);
        return ans;
    }
    
    static void recurse(List<List<Integer>> ans, int[] nums, int i, List<Integer> temp,
    		int tempSize, boolean chosePrev) {
    	if(i==nums.length) {
			ans.add(new ArrayList<Integer>(temp));
			return;
		}	
    	
    	recurse(ans,nums,i+1,temp,tempSize,false);
    	
    	if(i>0 && nums[i]==nums[i-1] && !chosePrev)
    		return;
    	temp.add(nums[i]);
    	recurse(ans,nums,i+1,temp,tempSize+1,true);
    	temp.remove(tempSize);
    }

}
