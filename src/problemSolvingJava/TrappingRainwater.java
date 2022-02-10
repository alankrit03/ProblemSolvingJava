package problemSolvingJava;

public class TrappingRainwater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int trap(int[] height) {
        int[] nextGreatest = findNextGreatest(height);
        int ans = 0,prev = 0;
        for(int i=0; i<height.length; i++) {
        	ans += Math.max(0, Math.min(nextGreatest[i], prev)-height[i]);
            prev= Math.max(prev,height[i]);
        }
        return ans;
    }
    
    public static int[] findNextGreatest(int[] height) {
    	int[] ans = new int[height.length];
    	int max = 0;
    	for(int i=height.length-1; i>=0; i--) {
    		ans[i] = max;
    		max = Math.max(max, height[i]);
    	}
    	return ans;
    }

}
