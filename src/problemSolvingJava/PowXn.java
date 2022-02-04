package problemSolvingJava;

public class PowXn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public double myPow(double x, int n) {
    	
    	if (n<0) {
    		return recurse(1/x, -n);
    	}
    	return recurse(x,n);
    	
    }
    
    public double recurse(double x, int n) {
    	if (n==0) {
    		return 1;
        }
    	if (n%2==0) {
    		return recurse(x*x, n/2);
    	}
    	return x*recurse(x*x, n/2);
    }

}
