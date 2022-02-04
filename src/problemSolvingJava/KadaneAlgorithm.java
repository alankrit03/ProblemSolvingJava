package problemSolvingJava;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxSubArray(int[] nums) {
		int n = nums.length;
		int max, maxSoFar;
		max = maxSoFar = nums[0];
		
		for(int i=1; i<n; i++) {
			if(maxSoFar<0)
				maxSoFar=0;
			maxSoFar += nums[i];
			if(maxSoFar>max)
				max = maxSoFar;
			
		}
		return max;
    }

}
