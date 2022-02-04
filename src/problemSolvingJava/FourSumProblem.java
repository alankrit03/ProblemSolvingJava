package problemSolvingJava;
import java.util.*;

public class FourSumProblem {

	public static void main(String[] args) {
		FourSumProblem obj = new FourSumProblem();
		int[] nums = {1,0,-1,0,-2,2};
		obj.fourSum(nums, 0);

	}
	
	private static void displayArray(int[] nums) {
		for(int item:nums) {
			System.out.print(item+" ");
		}
		System.out.println();
	}
	
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> ans = new ArrayList<List<Integer>>();
    	int n = nums.length;
    	Arrays.sort(nums);
//    	displayArray(nums);
    	int i=0,j,idx1,idx2,modifiedTarget;
    	while(i<n-3) {
    		j = i+1;
//    		System.out.println(i+" "+j+" "+modifiedTarget);
    		while(j<n) {
    			modifiedTarget = target-nums[i]-nums[j];
    			idx1 = j+1;
    			idx2 = n-1;
//    			System.out.println(i+" "+j+" "+modifiedTarget);
    			while(idx1<idx2) {
//    				System.out.printf("i=%d j=%d idx1=%d idx2=%d\n",i,j,idx1,idx2);
    				if(nums[idx1]+nums[idx2] == modifiedTarget) {
    					ans.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[idx1], nums[idx2])));
    					idx1 = nextIdxRight(nums,idx1);
    					idx2 = nextIdxLeft(nums,idx2);
    				}
    				else if(nums[idx1]+nums[idx2] > modifiedTarget)
    					idx2 = nextIdxLeft(nums,idx2);
    				else
    					idx1 = nextIdxRight(nums,idx1);
    			}
    			j = nextIdxRight(nums,j);
    		}
    		i = nextIdxRight(nums,i);
    	}
        return ans;
    }
    
    private static int nextIdxRight(int[] nums, int start) {
    	do {
    		start++;
    	}while(start<nums.length && nums[start]==nums[start-1]);
    	return start;
    }
    
    private static int nextIdxLeft(int[] nums, int start) {
    	do {
    		start--;
    	}while(start>=0 && nums[start]==nums[start+1]);
    	return start;
    }

}
