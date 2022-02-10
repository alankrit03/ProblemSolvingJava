package problemSolvingJava;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, ans = 0;
        for(int item:nums) {
        	if(item==1) {
        		count++;
        		ans = Math.max(count, ans);
        	}
        	else
        		count=0;
        }
        
        return ans;
    }

}
