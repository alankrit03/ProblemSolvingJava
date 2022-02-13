package problemSolvingJava;

public class KthPermutationSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public String getPermutation(int n, int k) {
        String[] ans = new String[1];
        boolean[] cache = new boolean[n+1];
        int[] counter = new int[1];
        recurse(ans,n,k,"",cache,counter,0);
        return ans[0];
    }
    
    static void recurse(String[] ans, int n,int k, String temp, boolean[] cache, int[] counter, int tempSize) {
    	if(counter[0]>k)
    		return;
    	if(tempSize==n) {
    		counter[0]++;
    		if(counter[0]==k) {
    			ans[0] = new String(temp);
    		}
    		return;
    	}
    	for(int j=1;j<=n;j++) {
    		if(cache[j]==false) {
    			cache[j] = true;
    			recurse(ans,n,k,temp+Integer.toString(j),cache,counter,tempSize+1);
    			cache[j] = false;
    		}
    	}
    }

}
