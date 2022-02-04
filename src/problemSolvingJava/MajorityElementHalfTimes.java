package problemSolvingJava;

public class MajorityElementHalfTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int majorityElement(int[] nums) {
    	int ans = nums[0];
    	int count = 1;
    	for(int i =1; i<nums.length; i++) {
    		if(ans == nums[i])
    			count++;
    		else {
    			if (count==1) {
    				ans = nums[i];
    			}
    			else
    				count--;
    		}
    	}
    	return ans;
    }

}
