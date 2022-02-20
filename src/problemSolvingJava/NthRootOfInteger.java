package problemSolvingJava;

public class NthRootOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static double findNthRootOfM(int n, long m) {
    	double lo=1,hi=m+1,precision=1e-6;
    	double mid;
    	while(hi-lo>precision) {
    		mid = lo+ (hi-lo)/2;
    		if(pow(mid,n)<=m)
    			lo=mid;
    		else
    			hi = mid;
    	}
    	return lo;
    }
    
    public static double pow(double x, int n) {
    	double ans = 1.0;
    	for(int i=1;i<=n;i++) {
    		ans *= x;
    	}
    	return ans;
    }

}
