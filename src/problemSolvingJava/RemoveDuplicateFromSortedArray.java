package problemSolvingJava;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<1) {
        	return n;
        }
        int i = 0,j=i,max=nums[i];
        while(j<n) {
        	swap(nums,i,j);
        	max = Math.max(max, nums[i]);
        	j = findNextEligible(nums,i,max);
        }
        return i+1;
    }
    
    public static void swap(int[] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
    
    public static int findNextEligible(int[] nums, int start, int max) {
    	int ans = start+1;
    	while(ans<nums.length && nums[ans]<=max) {
    		ans++;
    	}
    	return ans;
    }
}