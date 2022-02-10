package problemSolvingJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> tempAns = new ArrayList<Integer>();
        int i=0, idx1,idx2,target;
        int n = nums.length;
        
        while(i<n-2) {
        	target = -nums[i];
        	idx1 = i+1;
        	idx2 = n-1;
        	while(idx1<idx2) {
        		if(nums[idx1]+nums[idx2]==target) {
        			tempAns.add(nums[i]);
        			tempAns.add(nums[idx1]);
        			tempAns.add(nums[idx2]);
        			ans.add(new ArrayList<Integer>(tempAns));
        			tempAns.clear();
        			idx1 = nextIdxRight(nums,idx1,n);
        			idx2 = nextIdxLeft(nums,idx2,n);
        		}
        		else if(nums[idx1]+nums[idx2]>target)
        			idx2 = nextIdxLeft(nums,idx2,n);
        		else
        			idx1 = nextIdxRight(nums, idx1,n);
        	}
        	i = nextIdxRight(nums,i,n);
        }
        return ans;
    }
    
    public static int nextIdxRight(int[] nums, int idx, int n) {
    	idx++;
    	while(idx<n && nums[idx]==nums[idx-1]) {
    		idx++;
    	}
    	return idx;
    }
    
    public static int nextIdxLeft(int[] nums, int idx, int n) {
    	idx--;
    	while(idx>0 && nums[idx]==nums[idx+1]) {
    		idx--;
    	}
    	return idx;
    }
}